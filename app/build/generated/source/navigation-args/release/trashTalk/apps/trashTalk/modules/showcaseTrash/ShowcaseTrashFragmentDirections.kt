package trashTalk.apps.trashTalk.modules.showcaseTrash

import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections

public class ShowcaseTrashFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
