// Generated by view binder compiler. Do not edit!
package trashTalk.apps.trashTalk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import trashTalk.apps.trashTalk.R;

public final class FragmentEditTrashBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button cancelRecipeButton;

  @NonNull
  public final EditText editRecipe;

  @NonNull
  public final EditText editTrashName;

  @NonNull
  public final ImageView previewTrashImageView;

  @NonNull
  public final TextView recipeTextView;

  @NonNull
  public final Button saveRecipeButton;

  @NonNull
  public final TextView trashNameTextView;

  @NonNull
  public final ImageButton uploadImageButton;

  @NonNull
  public final TextView uploadImageTextView;

  private FragmentEditTrashBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button cancelRecipeButton, @NonNull EditText editRecipe,
      @NonNull EditText editTrashName, @NonNull ImageView previewTrashImageView,
      @NonNull TextView recipeTextView, @NonNull Button saveRecipeButton,
      @NonNull TextView trashNameTextView, @NonNull ImageButton uploadImageButton,
      @NonNull TextView uploadImageTextView) {
    this.rootView = rootView;
    this.cancelRecipeButton = cancelRecipeButton;
    this.editRecipe = editRecipe;
    this.editTrashName = editTrashName;
    this.previewTrashImageView = previewTrashImageView;
    this.recipeTextView = recipeTextView;
    this.saveRecipeButton = saveRecipeButton;
    this.trashNameTextView = trashNameTextView;
    this.uploadImageButton = uploadImageButton;
    this.uploadImageTextView = uploadImageTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditTrashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditTrashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_trash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditTrashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancelRecipeButton;
      Button cancelRecipeButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelRecipeButton == null) {
        break missingId;
      }

      id = R.id.editRecipe;
      EditText editRecipe = ViewBindings.findChildViewById(rootView, id);
      if (editRecipe == null) {
        break missingId;
      }

      id = R.id.editTrashName;
      EditText editTrashName = ViewBindings.findChildViewById(rootView, id);
      if (editTrashName == null) {
        break missingId;
      }

      id = R.id.previewTrashImageView;
      ImageView previewTrashImageView = ViewBindings.findChildViewById(rootView, id);
      if (previewTrashImageView == null) {
        break missingId;
      }

      id = R.id.recipeTextView;
      TextView recipeTextView = ViewBindings.findChildViewById(rootView, id);
      if (recipeTextView == null) {
        break missingId;
      }

      id = R.id.saveRecipeButton;
      Button saveRecipeButton = ViewBindings.findChildViewById(rootView, id);
      if (saveRecipeButton == null) {
        break missingId;
      }

      id = R.id.trashNameTextView;
      TextView trashNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (trashNameTextView == null) {
        break missingId;
      }

      id = R.id.uploadImageButton;
      ImageButton uploadImageButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadImageButton == null) {
        break missingId;
      }

      id = R.id.uploadImageTextView;
      TextView uploadImageTextView = ViewBindings.findChildViewById(rootView, id);
      if (uploadImageTextView == null) {
        break missingId;
      }

      return new FragmentEditTrashBinding((ConstraintLayout) rootView, cancelRecipeButton,
          editRecipe, editTrashName, previewTrashImageView, recipeTextView, saveRecipeButton,
          trashNameTextView, uploadImageButton, uploadImageTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
