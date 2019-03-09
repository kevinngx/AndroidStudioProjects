package com.example.queuemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AllocatedLane extends AppCompatActivity {

    private static ImageView imageView;
    private static Button button;

    int[] images = {R.drawable.p01_neutral, R.drawable.p02_up, R.drawable.p03_right, R.drawable.p04_down, R.drawable.p05_left};

    public void resetDirection() {
        imageView = (ImageView) findViewById(R.id.imageView);
        //button = (Button) findViewById(R.id.resetButton);
        Random rand = new Random();
        int direction = rand.nextInt(4); // 0 = up 1 = right 2 = down 3 = left

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allocated_lane);

        // Get the Intent that started this activity and extract the string
        resetDirection();

    }

    public void resetDirection (View view) {

        //Randomize a number:
        Random rand = new Random();
        int direction = rand.nextInt(4); // 0 = up 1 = right 2 = down 3 = left
        setDirection(direction);

    }

    public void setDirection(int direction) {

        imageView = (ImageView) findViewById(R.id.imageView);
        String directionString = "";
        switch (direction) {
            case 0: directionString = "proceed up";
                imageView.setImageResource(R.drawable.p02_up);
                break;
            case 1: directionString = "proceed right";
                imageView.setImageResource(R.drawable.p03_right);
                break;
            case 2: directionString = "proceed down";
                imageView.setImageResource(R.drawable.p04_down);
                break;
            case 3: directionString = "proceed left";
                imageView.setImageResource(R.drawable.p05_left);
                break;
        }
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(directionString);

    }



}
