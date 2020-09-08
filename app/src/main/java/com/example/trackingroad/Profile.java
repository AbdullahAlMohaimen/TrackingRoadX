package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Profile extends AppCompatActivity implements View.OnClickListener{

    TextView fullName,userName,email,number,password,show;
    Button showPassword,changePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //addingBackButton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        fullName=(TextView)findViewById(R.id.fullNameShowId);
        userName=(TextView)findViewById(R.id.usernameShowId);
        email=(TextView)findViewById(R.id.emailShowId);
        number=(TextView)findViewById(R.id.numberShowId);
        show=(TextView)findViewById(R.id.numberShowId);
        password=(TextView)findViewById(R.id.passwordShowId);

        showPassword=(Button)findViewById(R.id.showPasswordButtonId);
        changePassword=(Button)findViewById(R.id.changePasswordButtonId);

        showPassword.setOnClickListener(this);
        changePassword.setOnClickListener(this);
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

        if(view.getId()==R.id.showPasswordButtonId)
        {


        }

        if(view.getId()==R.id.changePasswordButtonId)
        {


        }
    }
}