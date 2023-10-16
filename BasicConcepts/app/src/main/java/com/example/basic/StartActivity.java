package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.basic.data.User;

public class StartActivity extends AppCompatActivity {

    private Button signUpButton, loginButton, dashboardButton, aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initialiseViews();

        signUpButton.setOnClickListener(view -> {
//            start activity-> signUp activity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
//            finish();
        });

        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        aboutButton.setOnClickListener(view -> {

            User durgeshTiwari = new User("Durgesh Tiwari", "durgesh@gmail.com");

            String activityTitle="Welcome to about activity";
            String activityAbout="This is about activity";

            Intent intent = new Intent(this, AboutActivity.class);
            intent.putExtra("activityTitle",activityTitle);
            intent.putExtra("activityAbout",activityAbout);
            intent.putExtra("code",3302);
            intent.putExtra("user",durgeshTiwari);
            startActivity(intent);
        });

        dashboardButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        });
    }

    private void initialiseViews() {
        signUpButton = findViewById(R.id.signup_button);
        loginButton = findViewById(R.id.login_button);
        dashboardButton = findViewById(R.id.dashboard_button);
        aboutButton = findViewById(R.id.about_button);
    }
}