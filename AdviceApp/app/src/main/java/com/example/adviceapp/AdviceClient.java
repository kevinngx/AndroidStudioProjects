package com.example.adviceapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AdviceClient {

//    @GET("advice")
//     Call<Slip> getSlip();
//
//    @GET("advice/{slip_id}")
//    Call<Slip> getSpecificSlip(@Path("slip_id") int slip_id);

    @GET("advice")
    Call<SlipObject> getSlipObject();

    @GET("advice/{slip_id}")
    Call<SlipObject> getSpecificSlipObject(@Path("slip_id") int slip_id);

}
