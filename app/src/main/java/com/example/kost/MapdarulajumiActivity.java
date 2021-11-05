package com.example.kost;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapdarulajumiActivity extends FragmentActivity implements OnMapReadyCallback {

    LatLng kos_darul_ajumi = new LatLng(-8.60177,116.4996115);

    ArrayList<LatLng> daftarLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapdarulajumi);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

        daftarLokasi = new ArrayList<>();
        daftarLokasi.add(kos_darul_ajumi);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        for (int i = 0; i < daftarLokasi.size();i++) {
            googleMap.addMarker(new MarkerOptions().position(daftarLokasi.get(i)).title("Kos Darul Ajumi"));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(10));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(daftarLokasi.get(i)));

        } }

    }
