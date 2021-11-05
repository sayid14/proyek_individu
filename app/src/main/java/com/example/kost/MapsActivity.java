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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    LatLng kos_putri_andri = new LatLng(-8.6517931, 116.5219051);
    LatLng kos_reganda = new LatLng(-8.6524623,116.5334328);
    LatLng kos_h_sutarman = new LatLng(-8.6509499,116.5352846);
    LatLng kos_dianlestari = new LatLng(-8.6506635,116.5365452);
    LatLng kos_selong_seruni = new LatLng(-8.6534849,116.5396307);
    LatLng kos_putri = new LatLng(-8.6563699,116.5389441);
    LatLng kos_pak_sir = new LatLng(-8.6460071,116.5370451);

    ArrayList<LatLng> daftarLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

        daftarLokasi = new ArrayList<>();
        daftarLokasi.add(kos_putri_andri);
        daftarLokasi.add(kos_reganda);
        daftarLokasi.add(kos_h_sutarman);
        daftarLokasi.add(kos_dianlestari);
        daftarLokasi.add(kos_selong_seruni);
        daftarLokasi.add(kos_putri);
        daftarLokasi.add(kos_pak_sir);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        for (int i = 0; i < daftarLokasi.size();i++) {
            googleMap.addMarker(new MarkerOptions().position(daftarLokasi.get(i)).title("lokasi"));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(10));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(daftarLokasi.get(i)));

        } }}