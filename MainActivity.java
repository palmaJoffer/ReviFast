package com.example.sony.pruebamapa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {
    private GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoogleMap mapa = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa)).getMap();

        mapa.setMyLocationEnabled(true);

        //PRT Santiago

        mapa.addMarker(new MarkerOptions()
                .position(new LatLng(-33.418039, -70.708286))
                .title("REVISIONES APPLUS CHILE S.A./ QUINTA NORMAL")
                .snippet("dirección: Avda. Carrascal N°5720 \n" +
                        "telefono: 2 - 25828224 \n" +
                        "Comuna: Quinta Normal \n" +
                        "Horario de atencionón: 09:00 - 19:00 \n" +
                        "Código: B-1303 ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.logito)));

        mapa.addMarker(new MarkerOptions()
                .position(new LatLng(-33.515785, -70.757399))
                .title("REVISIONES APPLUS CHILE S.A./ MAIPÚ")
                .snippet("Dirección: Avda. Pajaritos N° 1250  \n" +
                        "Teléfono: 2-25828221 \n" +
                        "Comuna: Maipú \n" +
                        "Horario de atencionón: 09:00 - 19:00 \n" +
                        "Código: B-1305 ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.logito)));

        mapa.addMarker(new MarkerOptions()
                .position(new LatLng(-33.486410, -70.612391))
                .title("AUTOTEST S.A./ MAIPÚ")
                .snippet("Dirección: Av. Central 634 y 660  \n" +
                        "Teléfono: 2-25828221 \n" +
                        "Comuna: Maipú \n" +
                        "Horario de atencionón: 09:00 - 19:00 \n" +
                        "Código: B-1305 ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.logito)));


        //Servicios relacionado
        mapa.addMarker(new MarkerOptions()
                .position(new LatLng(-33.485326, -70.612668))
                .title("Servicio Relacionado")
                .snippet("Dirección: Quilín 1740  \n" +
                        "Teléfono: 1234567 \n" +
                        "Comuna: Macul \n" +
                        "Horario de atencionón: 08:00 - 18:00 \n" +
                        "Servicio: Repracion de luces, y cambio de aceite ")
                );


        mapa.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(
                        MainActivity.this,
                        "Marcador presionado:\n" +
                                marker.getTitle(),
                        Toast.LENGTH_SHORT).show();

                return false;
            }
        });

        mapa.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Toast.makeText(
                        MainActivity.this,
                        "Detalle de marcador:\n" +
                                marker.getSnippet(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        /*LatLng df = new LatLng(19.432247,-99.133121);
        CameraPosition camPos = new CameraPosition.Builder()
                .target(df)  	  //Centramos el mapa en DF
                .zoom(18)         //Establecemos el zoom en 18
                .bearing(45)      //Establecemos la orientación con el noreste arriba
                .tilt(70)         //Bajamos el punto de vista de la cámara 70 grados
                .build();

        CameraUpdate camUpd3 =
            CameraUpdateFactory.newCameraPosition(camPos);

        mapa.animateCamera(camUpd3);*/
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
    }
