package com.example.adviceapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdviceAdapter extends RecyclerView.Adapter<AdviceAdapter.AdviceViewHolder> {
    private MainActivity mParentActivity;
    private List<Slip> mSlips;
    private boolean mTwoPane;

    public AdviceAdapter(MainActivity parent, List<Slip> slips, boolean twoPane) {
        mParentActivity = parent;
        mSlips = slips;
        mTwoPane = twoPane;
    }

    @Override
    public AdviceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.advice_slip, viewGroup, false);
        return new AdviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdviceViewHolder adviceViewHolder, int i) {
        Slip slip = mSlips.get(i);
        System.out.println("SLIP: " + slip.toString());
        adviceViewHolder.adviceSlip.setText(slip.getAdvice());
        adviceViewHolder.adviceId.setText(Integer.toString(slip.getSlip_id()));
    }

    @Override
    public int getItemCount() {
        return mSlips.size();
    }

    public class AdviceViewHolder extends RecyclerView.ViewHolder {
        public TextView adviceSlip;
        public TextView adviceId;

        public AdviceViewHolder(@NonNull View itemView) {
            super(itemView);
            adviceSlip = itemView.findViewById(R.id.adviceSlip);
            adviceId = itemView.findViewById(R.id.adviceId);
        }
    }



}
