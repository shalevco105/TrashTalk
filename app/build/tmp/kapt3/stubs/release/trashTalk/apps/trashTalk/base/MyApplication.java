package trashTalk.apps.trashTalk.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"LtrashTalk/apps/trashTalk/base/MyApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Globals", "app_release"})
public final class MyApplication extends android.app.Application {
    
    public MyApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"LtrashTalk/apps/trashTalk/base/MyApplication$Globals;", "", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "user", "LtrashTalk/apps/trashTalk/models/User;", "getUser", "()LtrashTalk/apps/trashTalk/models/User;", "setUser", "(LtrashTalk/apps/trashTalk/models/User;)V", "app_release"})
    public static final class Globals {
        @org.jetbrains.annotations.Nullable()
        private static android.content.Context appContext;
        @org.jetbrains.annotations.Nullable()
        private static trashTalk.apps.trashTalk.models.User user;
        @org.jetbrains.annotations.NotNull()
        public static final trashTalk.apps.trashTalk.base.MyApplication.Globals INSTANCE = null;
        
        private Globals() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getAppContext() {
            return null;
        }
        
        public final void setAppContext(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final trashTalk.apps.trashTalk.models.User getUser() {
            return null;
        }
        
        public final void setUser(@org.jetbrains.annotations.Nullable()
        trashTalk.apps.trashTalk.models.User p0) {
        }
    }
}