package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity  implements View.OnClickListener{

    Button staticButton,mapButton,vehicleButton,locationButton,gasStationButton,exitButton;
    ImageButton profile,profileSetting,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        staticButton=(Button)findViewById(R.id.staticId);
        mapButton=(Button)findViewById(R.id.mapId);
        vehicleButton=(Button)findViewById(R.id.vehicleId);
        locationButton=(Button)findViewById(R.id.locationId);
        gasStationButton=(Button)findViewById(R.id.gasStationId);
        exitButton=(Button)findViewById(R.id.exitId);

        profile=(ImageButton)findViewById(R.id.profileButton);
        profileSetting=(ImageButton)findViewById(R.id.profileSettingButton);
        logout=(ImageButton)findViewById(R.id.logoutButton);

        staticButton.setOnClickListener(this);
        mapButton.setOnClickListener(this);
        vehicleButton.setOnClickListener(this);
        locationButton.setOnClickListener(this);
        gasStationButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);

        profile.setOnClickListener(this);
        profileSetting.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.staticId)
        {
            Intent statics=new Intent(Login.this,Static.class);
            startActivity(statics);
        }


        if(view.getId()==R.id.locationId)
        {


        }


        if(view.getId()==R.id.vehicleId)
        {
            Intent vehicle=new Intent(Login.this,Vehicle.class);
            startActivity(vehicle);
        }


        if(view.getId()==R.id.mapId)
        {

        }


        if(view.getId()==R.id.gasStationId)
        {

        }


        if(view.getId()==R.id.exitId)
        {

        }

        if(view.getId()==R.id.profileButton)
        {
            Intent showProfile=new Intent(Login.this,Profile.class);
            startActivity(showProfile);
        }

        if(view.getId()==R.id.profileSettingButton)
        {
            Intent showSetting=new Intent(Login.this,profileSetting.class);
            startActivity(showSetting);
        }

        if(view.getId()==R.id.logoutButton)
        {
            Intent logout=new Intent(Login.this,MainActivity.class);
            startActivity(logout);
        }
    }
}