package trashTalk.apps.trashTalk.modules.addTrash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.squareup.picasso.Picasso
import trashTalk.apps.trashTalk.R
import trashTalk.apps.trashTalk.base.MyApplication
import trashTalk.apps.trashTalk.databinding.FragmentAddTrashBinding
import trashTalk.apps.trashTalk.models.Trash
import trashTalk.apps.trashTalk.models.Model
import trashTalk.apps.trashTalk.services.CloudinaryService
import java.util.UUID

class AddTrashFragment : Fragment() {

    private var _binding: FragmentAddTrashBinding? = null
    private val binding get() = _binding!!
    private lateinit var cloudinaryService: CloudinaryService
    private var trashImageUri: Uri? = null
    private val placeholderImageSrc = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Placeholder_view_vector.svg/681px-Placeholder_view_vector.svg.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        cloudinaryService = CloudinaryService()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTrashBinding.inflate(inflater, container, false)
        val view = binding.root
        setupUI(view)
        return view
    }

    private fun setupUI(view: View) {
        binding.uploadImageButton.setOnClickListener {
            val galleryIntent = Intent(Intent.ACTION_PICK).apply { type = "image/*" }
            imagePickerActivityResult.launch(galleryIntent)
        }

        binding.cancelButton.setOnClickListener {
            Navigation.findNavController(it).popBackStack(R.id.trashesFragment, false)
        }

        binding.saveButton.setOnClickListener {
            val address = binding.editTrashAddress.text.toString()
            val name = binding.editTrashName.text.toString()
            val author = MyApplication.Globals.user?.email ?: ""
            val id = UUID.randomUUID().toString()

            if (trashImageUri != null) {
                cloudinaryService.uploadImage(requireContext(), trashImageUri!!) { uri ->
                    saveTrash(Trash(id, name, address, author, uri), it)
                }
            } else {
                saveTrash(Trash(id, name, address, author, placeholderImageSrc), it)
            }
        }
    }

    private fun saveTrash(trash: Trash, view: View) {
        Model.instance.addTrash(trash) {
            Navigation.findNavController(view).navigate(R.id.trashesFragment)
        }
    }

    private var imagePickerActivityResult: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            result.data?.data?.let { uri ->
                trashImageUri = uri
                Picasso.get().load(trashImageUri).centerCrop().fit().into(binding.previewTrashImageView)
            }
        }
}
