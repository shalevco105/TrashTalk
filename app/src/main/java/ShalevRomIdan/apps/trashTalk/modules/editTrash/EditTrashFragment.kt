package trashTalk.apps.trashTalk.modules.editTrash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.squareup.picasso.Picasso
import trashTalk.apps.trashTalk.R
import trashTalk.apps.trashTalk.databinding.FragmentEditTrashBinding
import trashTalk.apps.trashTalk.models.Trash
import trashTalk.apps.trashTalk.models.Model
import trashTalk.apps.trashTalk.services.CloudinaryService


class EditTrashFragment : Fragment() {

    private var trashNameTextField: EditText? = null
    private var trashAddressTextField: EditText? = null
    private var trashImageView: ImageView? = null
    private var trashImageUri: Uri? = null
    private var saveButton: Button? = null
    private var cancelButton: Button? = null
    private var uploadImageButton: ImageButton? = null

    private var trash: Trash? = null

    private var _binding: FragmentEditTrashBinding? = null
    private val binding get() = _binding!!

    private lateinit var cloudinaryService: CloudinaryService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        cloudinaryService = CloudinaryService()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditTrashBinding.inflate(inflater, container, false)
        val view = binding.root

        val trashId = arguments?.let {
            EditTrashFragmentArgs.fromBundle(it).TRASHID
        }

        Model.instance.getTrashById(trashId ?: "") {
            trash = it
            trashImageUri = Uri.parse(trash?.imageUrl)
            setupUI(view)
        }

        return view
    }

    private fun setupUI(view: View) {
        trashNameTextField = binding.editTrashName
        trashAddressTextField = binding.editAddress
        trashImageView = binding.previewTrashImageView
        uploadImageButton = binding.uploadImageButton
        cancelButton = binding.cancelButton
        saveButton = binding.saveButton

        trashNameTextField?.setText(trash?.name)
        trashAddressTextField?.setText(trash?.address)

        Picasso.get()
            .load(trashImageUri)
            .into(trashImageView);

        uploadImageButton?.setOnClickListener {
            val galleryIntent = Intent(Intent.ACTION_PICK)
            galleryIntent.type = "image/*"
            imagePickerActivityResult.launch(galleryIntent)
        }

        cancelButton?.setOnClickListener { Navigation.findNavController(it).popBackStack(R.id.userTrashesFragment, false) }
        saveButton?.setOnClickListener {
            val name = trashNameTextField?.text.toString()
            val address = trashAddressTextField?.text.toString()

            if (trashImageUri.toString() == trash?.imageUrl) {
               trash?.let { it1 ->
                    val newTrash = Trash(it1.id, name, address,
                        it1.author, it1.imageUrl)
                   editTrash(newTrash, it)
               }
            } else {
                cloudinaryService.uploadImage(requireContext(), trashImageUri!!) { uri ->
                    trash?.let { it1 ->
                        val newTrash = Trash(
                            it1.id, name, address,
                            it1.author, uri
                        )
                        editTrash(newTrash, it)
                    }
                }
            }
        }
    }

    private fun editTrash(trash:Trash, view: View) {
        Model.instance.editTrash(trash) {
            Navigation.findNavController(view).navigate(R.id.userTrashesFragment)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
    }


    private var imagePickerActivityResult: ActivityResultLauncher<Intent> =
        registerForActivityResult( ActivityResultContracts.StartActivityForResult()) { result ->
            if (result != null && result.data?.data.toString().isNotEmpty()) {
                trashImageUri = result.data?.data

                Picasso.get()
                    .load(trashImageUri)
                    .centerCrop()
                    .fit()
                    .into(trashImageView);
            }
        }
}