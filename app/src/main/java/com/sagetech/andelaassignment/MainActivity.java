package com.sagetech.andelaassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAboutClick(View v)
    {
        Intent myIntent = new Intent(getBaseContext(), About.class);
        startActivity(myIntent);
    }

    public void onProfileClick(View v)
    {
        Intent link  = new Intent(getBaseContext(), profile.class);
        startActivity(link);
    }
}
