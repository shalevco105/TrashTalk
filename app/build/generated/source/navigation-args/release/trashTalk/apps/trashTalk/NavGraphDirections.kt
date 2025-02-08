package trashTalk.apps.trashTalk

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavGraphDirections private constructor() {
  public companion object {
    public fun actionGlobalAddTrashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_addTrashFragment)

    public fun actionGlobalLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_loginFragment)
  }
}
