package com.example.queuemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String ALLOCATED_DIRECTION = "com.example.queuemanagement.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void allocateLane (View view) {
        Intent intent = new Intent(this, AllocatedLane.class);
        startActivity(intent);

    }

}


