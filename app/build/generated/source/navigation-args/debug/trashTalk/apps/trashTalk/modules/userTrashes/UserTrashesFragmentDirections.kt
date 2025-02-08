package trashTalk.apps.trashTalk.modules.userTrashes

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import trashTalk.apps.trashTalk.NavGraphDirections
import trashTalk.apps.trashTalk.R

public class UserTrashesFragmentDirections private constructor() {
  private data class ActionTrashesFragmentToShowcaseTrashFragment(
    public val TRASHNAME: String,
    public val TRASHRECIPE: String,
    public val TRASHIMAGEURL: String,
    public val TRASHAUTHOR: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_trashesFragment_to_showcaseTrashFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("TRASH_NAME", this.TRASHNAME)
        result.putString("TRASH_RECIPE", this.TRASHRECIPE)
        result.putString("TRASH_IMAGE_URL", this.TRASHIMAGEURL)
        result.putString("TRASH_AUTHOR", this.TRASHAUTHOR)
        return result
      }
  }

  private data class ActionUserTrashesFragmentToEditTrashFragment(
    public val TRASHID: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_userTrashesFragment_to_editTrashFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("TRASH_ID", this.TRASHID)
        return result
      }
  }

  public companion object {
    public fun actionTrashesFragmentToShowcaseTrashFragment(
      TRASHNAME: String,
      TRASHRECIPE: String,
      TRASHIMAGEURL: String,
      TRASHAUTHOR: String,
    ): NavDirections = ActionTrashesFragmentToShowcaseTrashFragment(TRASHNAME, TRASHRECIPE,
        TRASHIMAGEURL, TRASHAUTHOR)

    public fun actionUserTrashesFragmentToEditTrashFragment(TRASHID: String): NavDirections =
        ActionUserTrashesFragmentToEditTrashFragment(TRASHID)

    public fun actionGlobalAddTrashFragment(): NavDirections =
        NavGraphDirections.actionGlobalAddTrashFragment()

    public fun actionGlobalLoginFragment(): NavDirections =
        NavGraphDirections.actionGlobalLoginFragment()
  }
}
