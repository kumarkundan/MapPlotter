package com.example.kundan.mapplotter;

/**
 * Created by kundan on 2/18/2016.
 * This class is for plotting the path using latlong objects returned from azure database
 */

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

public class LocationSender extends FragmentActivity{






    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_plotter);
        
        //getting latitude and longitude from shared preference 

        SharedPreferences prefs = getSharedPreferences("My location pref", MODE_PRIVATE);
        String restoredText = prefs.getString("1st long", null);// "" in place of null
        double ln1 = 0,la1 = 0,ln2 = 0,la2 = 0,ln3 = 0,la3 = 0,ln4 = 0,la4 = 0,ln5 = 0,la5 = 0;
        if (restoredText != null) {
            ln1 = Double.parseDouble(prefs.getString("1st long", ""));
            la1 = Double.parseDouble(prefs.getString("1st lat", ""));
            ln2 = Double.parseDouble(prefs.getString("2st long", ""));
            la2 = Double.parseDouble(prefs.getString("2st lat", ""));
            ln3 = Double.parseDouble(prefs.getString("3st long", ""));
            la3 = Double.parseDouble(prefs.getString("3st lat", ""));
            ln4 = Double.parseDouble(prefs.getString("4st long", ""));
            la4 = Double.parseDouble(prefs.getString("4st lat", ""));
            ln5 = Double.parseDouble(prefs.getString("5st long", ""));
            la5 = Double.parseDouble(prefs.getString("5st lat", ""));

        }
        
        //creating lat log objects

        LatLng l1 = new LatLng(la1, ln1);
        LatLng l2 = new LatLng(la2, ln2);
        LatLng l3 = new LatLng(la3, ln3);
        LatLng l4 = new LatLng(la4, ln4);
        LatLng l5 = new LatLng(la5, ln5);


        setUpMapIfNeeded(l1,l2,l3,l4,l5);
    }

    private void setUpMapIfNeeded(LatLng l1, LatLng l2, LatLng l3, LatLng l4, LatLng l5) {
        // check if we have got the googleMap already
        if (googleMap == null) {
            googleMap = ((SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map)).getMap();
            if (googleMap != null) {
                addLines(l1,l2,l3,l4,l5);
            }
        }
    }

    private void addLines(LatLng l1, LatLng l2, LatLng l3, LatLng l4, LatLng l5) {

        googleMap
                .addPolyline((new PolylineOptions())
                        .add(l1,l2,l3,l4,l5).width(5).color(Color.BLUE)
                        .geodesic(true));
        // move camera to zoom on map
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(l1,
                13));
    }
}
