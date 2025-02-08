package trashTalk.apps.trashTalk.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\r\u001a\u00020\u000bH\'J!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"LtrashTalk/apps/trashTalk/dao/TrashDao;", "", "delete", "", "trash", "LtrashTalk/apps/trashTalk/models/Trash;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getTrashByName", "name", "", "getTrashesByUser", "email", "insert", "", "([LtrashTalk/apps/trashTalk/models/Trash;)V", "app_debug"})
@androidx.room.Dao()
public abstract interface TrashDao {
    
    @androidx.room.Query(value = "SELECT * FROM Trash")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> getAll();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.Trash... trash);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.Trash trash);
    
    @androidx.room.Query(value = "SELECT * FROM Trash WHERE name =:name")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<trashTalk.apps.trashTalk.models.Trash> getTrashByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @androidx.room.Query(value = "SELECT * FROM Trash WHERE author =:email")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<trashTalk.apps.trashTalk.models.Trash>> getTrashesByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}