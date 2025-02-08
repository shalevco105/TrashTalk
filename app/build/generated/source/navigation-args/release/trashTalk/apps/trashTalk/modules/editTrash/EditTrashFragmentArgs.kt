package trashTalk.apps.trashTalk.modules.editTrash

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class EditTrashFragmentArgs(
  public val TRASHID: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("TRASH_ID", this.TRASHID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("TRASH_ID", this.TRASHID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditTrashFragmentArgs {
      bundle.setClassLoader(EditTrashFragmentArgs::class.java.classLoader)
      val __TRASHID : String?
      if (bundle.containsKey("TRASH_ID")) {
        __TRASHID = bundle.getString("TRASH_ID")
        if (__TRASHID == null) {
          throw IllegalArgumentException("Argument \"TRASH_ID\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_ID\" is missing and does not have an android:defaultValue")
      }
      return EditTrashFragmentArgs(__TRASHID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EditTrashFragmentArgs {
      val __TRASHID : String?
      if (savedStateHandle.contains("TRASH_ID")) {
        __TRASHID = savedStateHandle["TRASH_ID"]
        if (__TRASHID == null) {
          throw IllegalArgumentException("Argument \"TRASH_ID\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_ID\" is missing and does not have an android:defaultValue")
      }
      return EditTrashFragmentArgs(__TRASHID)
    }
  }
}
