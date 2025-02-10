package trashTalk.apps.trashTalk.services

import android.content.Context
import android.net.Uri
import android.util.Log
import com.cloudinary.Cloudinary
import com.cloudinary.utils.ObjectUtils
import java.io.File
import java.io.FileOutputStream

class CloudinaryService {

    private val cloudinary: Cloudinary = Cloudinary(
        ObjectUtils.asMap(
            "cloud_name", "dy5xyzlhm",
            "api_key", "576721329452639",
            "api_secret", "xiPVujuY3tz3RxBqcZ8futbNVp8"
        )
    )

    fun uploadImage(context: Context, imageUri: Uri, callback: (String) -> Unit) {
        val filePath = getFilePathFromUri(context, imageUri) // Convert URI to file path

        Thread {
            try {
                val result = cloudinary.uploader().upload(File(filePath), ObjectUtils.emptyMap())
                val imageUrl = result["secure_url"] as String
                Log.d("Cloudinary", "Upload success - $imageUrl")
                callback(imageUrl)
            } catch (e: Exception) {
                Log.e("Cloudinary", "Image upload failed: ${e.message}")
            }
        }.start()
    }

    private fun getFilePathFromUri(context: Context, uri: Uri): String {
        val inputStream = context.contentResolver.openInputStream(uri)
        val file = File(context.cacheDir, "temp_image_file")
        val outputStream = FileOutputStream(file)

        inputStream?.use { input ->
            outputStream.use { output ->
                input.copyTo(output)
            }
        }
        return file.absolutePath
    }
}
