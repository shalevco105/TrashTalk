// Generated by view binder compiler. Do not edit!
package trashTalk.apps.trashTalk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import trashTalk.apps.trashTalk.R;

public final class FragmentMapBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LinearLayout infoCard;

  @NonNull
  public final TextView infoText;

  private FragmentMapBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout infoCard,
      @NonNull TextView infoText) {
    this.rootView = rootView;
    this.infoCard = infoCard;
    this.infoText = infoText;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_map, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.infoCard;
      LinearLayout infoCard = ViewBindings.findChildViewById(rootView, id);
      if (infoCard == null) {
        break missingId;
      }

      id = R.id.infoText;
      TextView infoText = ViewBindings.findChildViewById(rootView, id);
      if (infoText == null) {
        break missingId;
      }

      return new FragmentMapBinding((FrameLayout) rootView, infoCard, infoText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
