package trashTalk.apps.trashTalk.modules.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections
import trashTalk.apps.trashTalk.R

public class SignUpFragmentDirections private constructor() {
  public companion object {
    public fun actionSignUpFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment)

    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
