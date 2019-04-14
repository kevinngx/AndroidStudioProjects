package com.example.coursescheduleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private ArrayList<CourseSchedule> courseSchedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gets course schedule
        courseSchedule = getCourseSchedule();

        // Set up RecyclerView
        RecyclerView recyclerView =  findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        // Create and set adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(courseSchedule, this);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<CourseSchedule> getCourseSchedule() {
        // Hard coded data set
        // Should move this to the CourseSchedule App and/or
        ArrayList<CourseSchedule> courseSchedule = new ArrayList<CourseSchedule>();
        courseSchedule.add(new CourseSchedule("Week 1",  "18 Feb", "Introduction & Android Fundamentals", "Android Studio, Git & App Basics", "-"));
        courseSchedule.add(new CourseSchedule("Week 2", "25 Feb", "Activities, Lifecycle & Intents", "Activities & Intents", "-"));
        courseSchedule.add(new CourseSchedule("Week 3","4 Mar", "Layouts & UI", "Designing a UI", "-"));
        courseSchedule.add(new CourseSchedule("Week 4", "11 Mar", "Lists & Adapters", "Displaying Items in a List", "-"));
        courseSchedule.add(new CourseSchedule("Week 5", "18 Mar", "Fragments & Multi-layout Apps", "Fragments for Multi-Layout Apps", "-"));
        courseSchedule.add(new CourseSchedule("Week 6", "25 Mar", "APIs, Permissions & Libraries", "APIs & JSON", "-"));
        courseSchedule.add(new CourseSchedule("Week 7", "1 Apr", "Networking", "Networking", "-"));
        courseSchedule.add(new CourseSchedule("Week 8", "8 Apr", "Threads & Async Tasks", "Async Tasks", "-"));
        courseSchedule.add(new CourseSchedule("Week 9", "15 Apr", "Data Saving", "Database", "-"));
        courseSchedule.add(new CourseSchedule("Week 10", "22 Apr", "Outlook & Course Summary", "Revision", "-"));
        return  courseSchedule;
    }

}
