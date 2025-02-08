package trashTalk.apps.trashTalk.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"LtrashTalk/apps/trashTalk/dao/UserDao;", "", "delete", "", "user", "LtrashTalk/apps/trashTalk/models/User;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getUserByEmail", "email", "", "insert", "", "([LtrashTalk/apps/trashTalk/models/User;)V", "app_debug"})
@androidx.room.Dao()
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM User")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.User>> getAll();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.User... user);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.User user);
    
    @androidx.room.Query(value = "SELECT * FROM User WHERE email =:email")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<trashTalk.apps.trashTalk.models.User> getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}