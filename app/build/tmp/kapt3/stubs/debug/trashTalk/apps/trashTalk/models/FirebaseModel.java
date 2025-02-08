package trashTalk.apps.trashTalk.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u001c\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u001c\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u001c\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\u00060\u0013J0\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\u00060\u0013J\"\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0013J\"\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0013J,\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"LtrashTalk/apps/trashTalk/models/FirebaseModel;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addTrash", "", "trash", "LtrashTalk/apps/trashTalk/models/Trash;", "callback", "Lkotlin/Function0;", "addUser", "user", "LtrashTalk/apps/trashTalk/models/User;", "deleteTrash", "editTrash", "getAllTrashes", "since", "", "Lkotlin/Function1;", "", "getAllUserTrashes", "userEmail", "", "getTrashById", "id", "getUserByEmail", "email", "updateUser", "nickname", "imageUri", "Companion", "app_debug"})
public final class FirebaseModel {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRASHES_COLLECTION_PATH = "Trashes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERS_COLLECTION_PATH = "Users";
    @org.jetbrains.annotations.NotNull()
    public static final trashTalk.apps.trashTalk.models.FirebaseModel.Companion Companion = null;
    
    public FirebaseModel() {
        super();
    }
    
    public final void getAllTrashes(long since, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<trashTalk.apps.trashTalk.models.Trash>, kotlin.Unit> callback) {
    }
    
    public final void getAllUserTrashes(@org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, long since, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<trashTalk.apps.trashTalk.models.Trash>, kotlin.Unit> callback) {
    }
    
    public final void deleteTrash(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.Trash trash, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void addTrash(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.Trash trash, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void editTrash(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.Trash trash, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    trashTalk.apps.trashTalk.models.User user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super trashTalk.apps.trashTalk.models.User, kotlin.Unit> callback) {
    }
    
    public final void getTrashById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super trashTalk.apps.trashTalk.models.Trash, kotlin.Unit> callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"LtrashTalk/apps/trashTalk/models/FirebaseModel$Companion;", "", "()V", "TRASHES_COLLECTION_PATH", "", "USERS_COLLECTION_PATH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}