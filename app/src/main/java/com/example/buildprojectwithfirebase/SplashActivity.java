package com.example.buildprojectwithfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nexActivity();
            }
        }, 2000);
    }
    public void nexActivity(){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){
            Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}