package com.example.adviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://api.adviceslip.com/";
    private static final String TAG = "MainActivity";

    private boolean mTwoPane;
    private AdviceAdapter mAdapter;
    RecyclerView adviceLogRecyclerView;
    ArrayList<Slip> adviceSlips = new ArrayList<Slip>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.adviceSlip) != null) {
            mTwoPane = true;
        }

        adviceLogRecyclerView = findViewById(R.id.AdviceRecyclerView);
        adviceLogRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        adviceLogRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new AdviceAdapter(this, adviceSlips, mTwoPane);
        adviceLogRecyclerView.setAdapter(mAdapter);

    }

    public void getAdvice(View view) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AdviceClient service = retrofit.create(AdviceClient.class);
        Call<SlipObject> call = service.getSlipObject();
        call.enqueue(new Callback<SlipObject>() {
            @Override
            public void onResponse(Call<SlipObject> call, Response<SlipObject> response) {
                SlipObject slipObject = response.body();
                System.out.println(response.body().toString());

                TextView adviceText = (TextView) findViewById(R.id.adviceText);
                adviceText.setText(slipObject.getSlip().advice);
                refreshLog(slipObject.getSlip());
            }

            @Override
            public void onFailure(Call<SlipObject> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    private void refreshLog(Slip slip) {
        System.out.println("ADDING NEW SLIP TO RECYCLER VIEW");
        System.out.println(slip.toString());
        adviceSlips.add( 0, slip);
        mAdapter = new AdviceAdapter(this, adviceSlips, mTwoPane);
        adviceLogRecyclerView.setAdapter(mAdapter);
    }



}
