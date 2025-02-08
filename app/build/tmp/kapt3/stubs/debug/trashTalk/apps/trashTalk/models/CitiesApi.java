package trashTalk.apps.trashTalk.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"LtrashTalk/apps/trashTalk/models/CitiesApi;", "", "getCities", "Lretrofit2/Call;", "LtrashTalk/apps/trashTalk/models/CitiesResultWrapper;", "query", "", "number", "", "resourceId", "app_debug"})
public abstract interface CitiesApi {
    
    @retrofit2.http.GET(value = "api/3/action/datastore_search")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<trashTalk.apps.trashTalk.models.CitiesResultWrapper> getCities(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query, @retrofit2.http.Query(value = "limit")
    int number, @retrofit2.http.Query(value = "resource_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}