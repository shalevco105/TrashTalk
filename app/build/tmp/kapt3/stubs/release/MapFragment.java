
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00130\u0019J\b\u0010\u001b\u001a\u00020\u0013H\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0011H\u0016J-\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170-2\u0006\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"LMapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/location/LocationListener;", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "_binding", "LtrashTalk/apps/trashTalk/databinding/FragmentMapBinding;", "binding", "getBinding", "()LtrashTalk/apps/trashTalk/databinding/FragmentMapBinding;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "locationManager", "Landroid/location/LocationManager;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "checkLocationPermission", "", "enableMyLocation", "getLatLngFromAddress", "address", "", "callback", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "moveToCurrentLocation", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLocationChanged", "location", "Landroid/location/Location;", "onMapReady", "googleMap", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "showTrashDialog", "trash", "LtrashTalk/apps/trashTalk/models/Trash;", "app_release"})
public final class MapFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, android.location.LocationListener {
    @org.jetbrains.annotations.Nullable()
    private trashTalk.apps.trashTalk.databinding.FragmentMapBinding _binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private android.location.LocationManager locationManager;
    private final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    
    public MapFragment() {
        super();
    }
    
    private final trashTalk.apps.trashTalk.databinding.FragmentMapBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ServiceCast"})
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void showTrashDialog(trashTalk.apps.trashTalk.models.Trash trash) {
    }
    
    private final void checkLocationPermission() {
    }
    
    private final void enableMyLocation() {
    }
    
    private final void moveToCurrentLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void getLatLngFromAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
}