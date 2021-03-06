package com.example.coursescheduleapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<CourseSchedule> courseSchedule;
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<CourseSchedule> courseSchedule, Context mContext) {
        // Instantiates the adapter wit two parameters: the dataset and the context
        this.courseSchedule = courseSchedule;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        // This is the method that is responsible for inflating the view
        // Actually identifies the layout to be used inside of the RecyclerView
        // This is what is actually recycling the viewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // This actually changes the contents of the Layout inside the RecyclerView
        Log.d(TAG, "onBindViewHolder: called position #" + position);
        viewHolder.scheduleLectureTopic.setText(courseSchedule.get(position).getLectureTopic());
        viewHolder.scheduleLabTopic.setText(courseSchedule.get(position).getLabTopic());
        viewHolder.scheduleWeek.setText(courseSchedule.get(position).getWeek());
        viewHolder.scheduleAssessment.setText(courseSchedule.get(position).getAssessment());
        viewHolder.scheduleDate.setText(courseSchedule.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return courseSchedule.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView scheduleWeek;
        TextView scheduleLectureTopic;
        TextView scheduleLabTopic;
        TextView scheduleAssessment;
        TextView scheduleDate;

        public ViewHolder(View itemView) {
            super(itemView);

            scheduleWeek = itemView.findViewById(R.id.scheduleWeek);
            scheduleLectureTopic = itemView.findViewById(R.id.scheduleLectureTopic);
            scheduleLabTopic = itemView.findViewById(R.id.scheduleLabTopic);
            scheduleAssessment = itemView.findViewById(R.id.scheduleAssessment);
            scheduleDate = itemView.findViewById(R.id.scheduleDate);

        }

    }
}
