package trashTalk.apps.trashTalk.modules.showcaseTrash

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ShowcaseTrashFragmentArgs(
  public val TRASHNAME: String,
  public val TRASHRECIPE: String,
  public val TRASHIMAGEURL: String,
  public val TRASHAUTHOR: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("TRASH_NAME", this.TRASHNAME)
    result.putString("TRASH_RECIPE", this.TRASHRECIPE)
    result.putString("TRASH_IMAGE_URL", this.TRASHIMAGEURL)
    result.putString("TRASH_AUTHOR", this.TRASHAUTHOR)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("TRASH_NAME", this.TRASHNAME)
    result.set("TRASH_RECIPE", this.TRASHRECIPE)
    result.set("TRASH_IMAGE_URL", this.TRASHIMAGEURL)
    result.set("TRASH_AUTHOR", this.TRASHAUTHOR)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ShowcaseTrashFragmentArgs {
      bundle.setClassLoader(ShowcaseTrashFragmentArgs::class.java.classLoader)
      val __TRASHNAME : String?
      if (bundle.containsKey("TRASH_NAME")) {
        __TRASHNAME = bundle.getString("TRASH_NAME")
        if (__TRASHNAME == null) {
          throw IllegalArgumentException("Argument \"TRASH_NAME\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_NAME\" is missing and does not have an android:defaultValue")
      }
      val __TRASHRECIPE : String?
      if (bundle.containsKey("TRASH_RECIPE")) {
        __TRASHRECIPE = bundle.getString("TRASH_RECIPE")
        if (__TRASHRECIPE == null) {
          throw IllegalArgumentException("Argument \"TRASH_RECIPE\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_RECIPE\" is missing and does not have an android:defaultValue")
      }
      val __TRASHIMAGEURL : String?
      if (bundle.containsKey("TRASH_IMAGE_URL")) {
        __TRASHIMAGEURL = bundle.getString("TRASH_IMAGE_URL")
        if (__TRASHIMAGEURL == null) {
          throw IllegalArgumentException("Argument \"TRASH_IMAGE_URL\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_IMAGE_URL\" is missing and does not have an android:defaultValue")
      }
      val __TRASHAUTHOR : String?
      if (bundle.containsKey("TRASH_AUTHOR")) {
        __TRASHAUTHOR = bundle.getString("TRASH_AUTHOR")
        if (__TRASHAUTHOR == null) {
          throw IllegalArgumentException("Argument \"TRASH_AUTHOR\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_AUTHOR\" is missing and does not have an android:defaultValue")
      }
      return ShowcaseTrashFragmentArgs(__TRASHNAME, __TRASHRECIPE, __TRASHIMAGEURL, __TRASHAUTHOR)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ShowcaseTrashFragmentArgs {
      val __TRASHNAME : String?
      if (savedStateHandle.contains("TRASH_NAME")) {
        __TRASHNAME = savedStateHandle["TRASH_NAME"]
        if (__TRASHNAME == null) {
          throw IllegalArgumentException("Argument \"TRASH_NAME\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_NAME\" is missing and does not have an android:defaultValue")
      }
      val __TRASHRECIPE : String?
      if (savedStateHandle.contains("TRASH_RECIPE")) {
        __TRASHRECIPE = savedStateHandle["TRASH_RECIPE"]
        if (__TRASHRECIPE == null) {
          throw IllegalArgumentException("Argument \"TRASH_RECIPE\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_RECIPE\" is missing and does not have an android:defaultValue")
      }
      val __TRASHIMAGEURL : String?
      if (savedStateHandle.contains("TRASH_IMAGE_URL")) {
        __TRASHIMAGEURL = savedStateHandle["TRASH_IMAGE_URL"]
        if (__TRASHIMAGEURL == null) {
          throw IllegalArgumentException("Argument \"TRASH_IMAGE_URL\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_IMAGE_URL\" is missing and does not have an android:defaultValue")
      }
      val __TRASHAUTHOR : String?
      if (savedStateHandle.contains("TRASH_AUTHOR")) {
        __TRASHAUTHOR = savedStateHandle["TRASH_AUTHOR"]
        if (__TRASHAUTHOR == null) {
          throw IllegalArgumentException("Argument \"TRASH_AUTHOR\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"TRASH_AUTHOR\" is missing and does not have an android:defaultValue")
      }
      return ShowcaseTrashFragmentArgs(__TRASHNAME, __TRASHRECIPE, __TRASHIMAGEURL, __TRASHAUTHOR)
    }
  }
}
