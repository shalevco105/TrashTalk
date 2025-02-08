package trashTalk.apps.trashTalk.modules.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections
import trashTalk.apps.trashTalk.R

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_profileFragment)

    public fun actionGlobalTrashesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_trashesFragment)

    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
