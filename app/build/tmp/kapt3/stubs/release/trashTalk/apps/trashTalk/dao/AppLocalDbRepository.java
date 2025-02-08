package trashTalk.apps.trashTalk.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"LtrashTalk/apps/trashTalk/dao/AppLocalDbRepository;", "Landroidx/room/RoomDatabase;", "()V", "trashDao", "LtrashTalk/apps/trashTalk/dao/TrashDao;", "userDao", "LtrashTalk/apps/trashTalk/dao/UserDao;", "app_release"})
@androidx.room.Database(entities = {trashTalk.apps.trashTalk.models.Trash.class, trashTalk.apps.trashTalk.models.User.class}, version = 8)
public abstract class AppLocalDbRepository extends androidx.room.RoomDatabase {
    
    public AppLocalDbRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract trashTalk.apps.trashTalk.dao.TrashDao trashDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract trashTalk.apps.trashTalk.dao.UserDao userDao();
}