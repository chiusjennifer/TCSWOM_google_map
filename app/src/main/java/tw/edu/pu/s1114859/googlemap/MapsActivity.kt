package tw.edu.pu.s1114859.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

internal class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps)
        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        mMap.addMarker(MarkerOptions()
            .position()
            .title("財團法人基督教惠明盲人福利基金會"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng())
    }
    data class Location(val latitude: Double, val longitude: Double)object Locations {
        val Huiming = Location(24.22, 120.66)
        val Genius = Location( 24.15, 120.68)
        val Maria = Location( 24.19, 120.65)
        val Fuyu = Location( 24.16, 120.63)
        val Up = Location( 24.13, 120.66)
        val Zhengfeng = Location( 24.05, 120.69)
        val Renai = Location( 24.13, 120.65)
    }
    data class mapName(val mName:String){
        val Huiming = mapName("")
    }
}
