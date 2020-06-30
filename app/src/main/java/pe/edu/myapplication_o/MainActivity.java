package pe.edu.myapplication_o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnSuccessListener;

import java.util.HashMap;
import java.util.Map;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int MY_PERMISSIONS_REQUEST_READ_CONTACTS ;
    private FusedLocationProviderClient fusedLocationClient;
    DatabaseReference mDatabase;
    private Button mBtnMaps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mDatabase=FirebaseDatabase.getInstance().getReference();
        //subirLatLongFirebase();
        mBtnMaps=findViewById(R.id.btnMaps);
        mBtnMaps.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.btnMaps:
                Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
                break;
        }
    }
}