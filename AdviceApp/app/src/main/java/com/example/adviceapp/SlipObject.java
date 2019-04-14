package com.example.adviceapp;

public class SlipObject {
    Slip slip;

    public SlipObject(Slip slip) {
        this.slip = slip;
    }

    public Slip getSlip() {
        return slip;
    }

    public void setSlipObject(Slip slipObject) {
        this.slip = slipObject;
    }

    @Override
    public String toString() {
        return "SlipObject{" +
                "slip=" + slip +
                '}';
    }
}
