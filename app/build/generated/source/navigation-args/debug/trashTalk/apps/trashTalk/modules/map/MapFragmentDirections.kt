package trashTalk.apps.trashTalk.modules.map

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import trashTalk.apps.trashTalk.NavGraphDirections
import trashTalk.apps.trashTalk.R

public class MapFragmentDirections private constructor() {
  public companion object {
    public fun actionMapFragmentToTrashesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mapFragment_to_trashesFragment)

    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
