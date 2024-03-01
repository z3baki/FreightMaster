package com.example.Freight_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.project_login_development.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonDriver,buttonOwner,buttonPrivateUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentication_users);

        buttonDriver = (Button)findViewById(R.id.buttonTruckDrive);
        buttonOwner = (Button)findViewById(R.id.buttonOwner);
        buttonPrivateUser =(Button)findViewById(R.id.buttonPrivateUser);

        buttonDriver.setOnClickListener(click);
        buttonOwner.setOnClickListener(click);
        buttonPrivateUser.setOnClickListener(click);


    }

    OnClickListener click = new OnClickListener() {
        @Override
        public void onClick(View v) {
            LoginDriverTrucker();
            LoginOwner();
            LoginPrivateUser();
        }

    };




    private  void LoginDriverTrucker(){
        Intent TruckerButton = new Intent(this,Login.class);
        startActivity(TruckerButton);


    }
    private  void LoginOwner(){
        Intent OwnerButton = new Intent(this,Login.class);
        startActivity(OwnerButton);

    }
    private  void LoginPrivateUser(){
        Intent PrivateUserButton = new Intent(this,Login.class);
        startActivity(PrivateUserButton);
    }


}