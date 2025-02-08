package trashTalk.apps.trashTalk.modules.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0003J&\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010\'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010(\u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190*H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"LtrashTalk/apps/trashTalk/modules/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "LtrashTalk/apps/trashTalk/databinding/FragmentProfileBinding;", "binding", "getBinding", "()LtrashTalk/apps/trashTalk/databinding/FragmentProfileBinding;", "imagePickerActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "nicknameEdit", "Landroid/widget/TextView;", "placeholderImageSrc", "", "profileImageUri", "Landroid/net/Uri;", "progressBar", "Landroid/widget/ProgressBar;", "storageRef", "Lcom/google/firebase/storage/StorageReference;", "userEmailTextView", "userProfileImageView", "Landroid/widget/ImageView;", "chooseProfilePicture", "", "view", "Landroid/view/View;", "getFileName", "context", "Landroid/content/Context;", "uri", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSave", "uploadImageToServer", "callback", "Lkotlin/Function1;", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String placeholderImageSrc = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Placeholder_view_vector.svg/681px-Placeholder_view_vector.svg.png";
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView userEmailTextView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView userProfileImageView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView nicknameEdit;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri profileImageUri;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.storage.StorageReference storageRef;
    @org.jetbrains.annotations.Nullable()
    private trashTalk.apps.trashTalk.databinding.FragmentProfileBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> imagePickerActivityResult;
    
    public ProfileFragment() {
        super();
    }
    
    private final trashTalk.apps.trashTalk.databinding.FragmentProfileBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void chooseProfilePicture(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
    private final java.lang.String getFileName(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    private final void uploadImageToServer(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void onSave(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}