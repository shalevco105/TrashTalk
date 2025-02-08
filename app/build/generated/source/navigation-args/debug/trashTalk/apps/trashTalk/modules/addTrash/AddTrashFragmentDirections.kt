package trashTalk.apps.trashTalk.modules.addTrash

import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections

public class AddTrashFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
