package trashTalk.apps.trashTalk.modules.userTrashes.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010,\u001a\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006."}, d2 = {"LtrashTalk/apps/trashTalk/modules/userTrashes/adapter/UserTrashesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;", "trashes", "", "LtrashTalk/apps/trashTalk/models/Trash;", "(Landroid/view/View;LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;Ljava/util/List;)V", "deleteTrashButton", "Landroid/widget/ImageButton;", "getDeleteTrashButton", "()Landroid/widget/ImageButton;", "setDeleteTrashButton", "(Landroid/widget/ImageButton;)V", "editTrashButton", "getEditTrashButton", "setEditTrashButton", "getItemView", "()Landroid/view/View;", "getListener", "()LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;", "nameTextView", "Landroid/widget/TextView;", "getNameTextView", "()Landroid/widget/TextView;", "setNameTextView", "(Landroid/widget/TextView;)V", "trash", "getTrash", "()LtrashTalk/apps/trashTalk/models/Trash;", "setTrash", "(LtrashTalk/apps/trashTalk/models/Trash;)V", "trashImage", "Landroid/widget/ImageView;", "getTrashImage", "()Landroid/widget/ImageView;", "setTrashImage", "(Landroid/widget/ImageView;)V", "getTrashes", "()Ljava/util/List;", "setTrashes", "(Ljava/util/List;)V", "bind", "", "app_release"})
public final class UserTrashesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View itemView = null;
    @org.jetbrains.annotations.Nullable()
    private final trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener listener = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<trashTalk.apps.trashTalk.models.Trash> trashes;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView nameTextView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton deleteTrashButton;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton editTrashButton;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView trashImage;
    @org.jetbrains.annotations.Nullable()
    private trashTalk.apps.trashTalk.models.Trash trash;
    
    public UserTrashesViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.Nullable()
    trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener listener, @org.jetbrains.annotations.Nullable()
    java.util.List<trashTalk.apps.trashTalk.models.Trash> trashes) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getItemView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<trashTalk.apps.trashTalk.models.Trash> getTrashes() {
        return null;
    }
    
    public final void setTrashes(@org.jetbrains.annotations.Nullable()
    java.util.List<trashTalk.apps.trashTalk.models.Trash> p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    trashTalk.apps.trashTalk.models.Trash trash) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getNameTextView() {
        return null;
    }
    
    public final void setNameTextView(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getDeleteTrashButton() {
        return null;
    }
    
    public final void setDeleteTrashButton(@org.jetbrains.annotations.Nullable()
    android.widget.ImageButton p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getEditTrashButton() {
        return null;
    }
    
    public final void setEditTrashButton(@org.jetbrains.annotations.Nullable()
    android.widget.ImageButton p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getTrashImage() {
        return null;
    }
    
    public final void setTrashImage(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final trashTalk.apps.trashTalk.models.Trash getTrash() {
        return null;
    }
    
    public final void setTrash(@org.jetbrains.annotations.Nullable()
    trashTalk.apps.trashTalk.models.Trash p0) {
    }
}