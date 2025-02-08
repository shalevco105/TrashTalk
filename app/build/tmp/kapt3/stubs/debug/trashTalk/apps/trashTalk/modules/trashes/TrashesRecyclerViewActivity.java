package trashTalk.apps.trashTalk.modules.trashes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014\u00a8\u0006\t"}, d2 = {"LtrashTalk/apps/trashTalk/modules/trashes/TrashesRecyclerViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "OnItemClickListener", "app_debug"})
public final class TrashesRecyclerViewActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public TrashesRecyclerViewActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"LtrashTalk/apps/trashTalk/modules/trashes/TrashesRecyclerViewActivity$OnItemClickListener;", "", "onTrashClick", "", "trash", "LtrashTalk/apps/trashTalk/models/Trash;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onTrashClick(@org.jetbrains.annotations.Nullable()
        trashTalk.apps.trashTalk.models.Trash trash);
    }
}