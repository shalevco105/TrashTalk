package trashTalk.apps.trashTalk.modules.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections
import trashTalk.apps.trashTalk.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToTrashesFragment3(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_trashesFragment3)

    public fun actionLoginFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment)

    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
