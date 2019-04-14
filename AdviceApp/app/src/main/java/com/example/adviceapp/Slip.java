package com.example.adviceapp;
import com.google.gson.annotations.SerializedName;


public class Slip {

    @SerializedName("advice")
    public String advice;
    @SerializedName("slip_id")
    public int slip_id;

    public Slip(String advice, int slip_id) {
        this.advice = advice;
        this.slip_id = slip_id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public int getSlip_id() {
        return slip_id;
    }

    public void setSlip_id(int slip_id) {
        this.slip_id = slip_id;
    }

    @Override
    public String toString() {
        String string = "Advice ID: " + slip_id +
                "\nAdvice = " + advice +
                "\n";
        return string;
    }
}
