package trashTalk.apps.trashTalk.modules.auth

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.squareup.picasso.Picasso
import trashTalk.apps.trashTalk.R
import trashTalk.apps.trashTalk.databinding.FragmentSignUpBinding
import trashTalk.apps.trashTalk.models.Model
import trashTalk.apps.trashTalk.services.CloudinaryService

class SignUpFragment : Fragment() {
    private val placeholderImageSrc = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Placeholder_view_vector.svg/681px-Placeholder_view_vector.svg.png"

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    private var emailTextView: TextView? = null
    private var passwordTextView: TextView? = null
    private var nicknameTextView: TextView? = null
    private var progressBar: ProgressBar? = null
    private var profilePic: ImageView? = null
    private var profileImageUri: Uri? = null

    private lateinit var cloudinaryService: CloudinaryService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        cloudinaryService = CloudinaryService()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val view = binding.root
        emailTextView = binding.userNewEmail
        passwordTextView = binding.userNewPassword
        nicknameTextView = binding.nickname
        progressBar = binding.progressBarSignUp
        profilePic = binding.profilePic

        profilePic!!.setOnClickListener(::chooseProfilePicture)

        progressBar?.visibility = View.GONE

        val loginBtn = binding.signUpBtn
        loginBtn.setOnClickListener(::onSignUpWithFirebase)

        Picasso.get()
            .load(placeholderImageSrc)
            .into(profilePic);

        return view
    }

    fun onSignUpWithFirebase(view: View) {
        progressBar?.visibility = View.VISIBLE
        val email = emailTextView?.text.toString()
        val password = passwordTextView?.text.toString()
        val nickname = nicknameTextView?.text.toString()
        if(!(email.isNullOrBlank() ||
                    password.isNullOrBlank() ||
                    nickname.isNullOrBlank() ||
                    profileImageUri == null)) {
            cloudinaryService.uploadImage(requireContext(), profileImageUri!!) { uri ->
                Model.instance.signupUser(email, password, nickname, uri) { task ->
                    if (task.isSuccessful) {
                        Navigation.findNavController(view)
                            .navigate(R.id.action_signUpFragment_to_loginFragment)
                    } else {
                        Toast.makeText(
                            view.context,
                            "Sign up failed. ${task.exception?.message}",
                            Toast.LENGTH_SHORT,
                        ).show()
                    }
                    progressBar?.visibility = View.GONE
                }
            }
            } else {
            Toast.makeText(
                view.context,
                "Please fill all fields",
                Toast.LENGTH_SHORT,
            ).show()

            progressBar?.visibility = View.GONE
        }
    }

    fun chooseProfilePicture(view: View) {
        val galleryIntent = Intent(Intent.ACTION_PICK)
        galleryIntent.type = "image/*"
        imagePickerActivityResult.launch(galleryIntent)
    }

    private var imagePickerActivityResult: ActivityResultLauncher<Intent> =
        registerForActivityResult( ActivityResultContracts.StartActivityForResult()) { result ->
            if (result?.data?.data != null) {
                profileImageUri = result.data?.data

                Picasso.get()
                    .load(profileImageUri)
                    .into(profilePic);
            } else {
                Picasso.get()
                    .load(placeholderImageSrc)
                    .into(profilePic);
            }
        }
}