package trashTalk.apps.trashTalk.modules;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"LtrashTalk/apps/trashTalk/modules/TrashViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "myTrashes", "Landroidx/lifecycle/LiveData;", "", "LtrashTalk/apps/trashTalk/models/Trash;", "getMyTrashes", "()Landroidx/lifecycle/LiveData;", "setMyTrashes", "(Landroidx/lifecycle/LiveData;)V", "trashes", "getTrashes", "setTrashes", "app_release"})
public final class TrashViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> trashes;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> myTrashes;
    
    public TrashViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> getTrashes() {
        return null;
    }
    
    public final void setTrashes(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> getMyTrashes() {
        return null;
    }
    
    public final void setMyTrashes(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> p0) {
    }
}