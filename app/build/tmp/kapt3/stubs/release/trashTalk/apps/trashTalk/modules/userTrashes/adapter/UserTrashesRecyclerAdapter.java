package trashTalk.apps.trashTalk.modules.userTrashes.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"LtrashTalk/apps/trashTalk/modules/userTrashes/adapter/UserTrashesRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LtrashTalk/apps/trashTalk/modules/userTrashes/adapter/UserTrashesViewHolder;", "trashes", "", "LtrashTalk/apps/trashTalk/models/Trash;", "(Ljava/util/List;)V", "listener", "LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;", "getListener", "()LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;", "setListener", "(LtrashTalk/apps/trashTalk/modules/userTrashes/UserTrashesRecyclerViewActivity$OnItemClickListener;)V", "getTrashes", "()Ljava/util/List;", "setTrashes", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDataUpdated", "app_release"})
public final class UserTrashesRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<trashTalk.apps.trashTalk.modules.userTrashes.adapter.UserTrashesViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<trashTalk.apps.trashTalk.models.Trash> trashes;
    @org.jetbrains.annotations.Nullable()
    private trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener listener;
    
    public UserTrashesRecyclerAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<trashTalk.apps.trashTalk.models.Trash> trashes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<trashTalk.apps.trashTalk.models.Trash> getTrashes() {
        return null;
    }
    
    public final void setTrashes(@org.jetbrains.annotations.Nullable()
    java.util.List<trashTalk.apps.trashTalk.models.Trash> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    trashTalk.apps.trashTalk.modules.userTrashes.UserTrashesRecyclerViewActivity.OnItemClickListener p0) {
    }
    
    public final void onDataUpdated(@org.jetbrains.annotations.NotNull()
    java.util.List<trashTalk.apps.trashTalk.models.Trash> trashes) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public trashTalk.apps.trashTalk.modules.userTrashes.adapter.UserTrashesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.modules.userTrashes.adapter.UserTrashesViewHolder holder, int position) {
    }
}