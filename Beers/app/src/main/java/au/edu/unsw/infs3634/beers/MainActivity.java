package au.edu.unsw.infs3634.beers;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private boolean mTwoPane;
    private RecyclerView mRecyclerView;
    private BeerAdapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.detail_container) != null) {
            mTwoPane = true;
        }
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new BeerAdapter(MainActivity.this, new ArrayList<Beer>(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);

        new BeerAsyncTask().execute();

    }

    class BeerAsyncTask extends AsyncTask<Void, Void, BeersResponseData> {
        private static final String TAG = "BeerAsyncTask";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected BeersResponseData doInBackground(Void... voids) {

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

            try {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(Beer.BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                BreweryDbClient service = retrofit.create(BreweryDbClient.class);
                Call<BeersResponseData> beersCall = service.getBeerList(Beer.KEY, "Y");
                BeersResponseData beersResponseData = beersCall.execute().body();

                // Initialize database
                BeerDatabase db = Room
                        .databaseBuilder(MainActivity.this, BeerDatabase.class, "beer-data")
                        .build();

                ArrayList<Beer> beers = new ArrayList<>();
                // Insert all
                for (int i = 0; i <  beersResponseData.getData().size(); i++) {
                    System.out.println(beersResponseData.getData().get(i).toString());
                    db.beerDao().insert(beersResponseData.getData().get(i));
                }

                return beersResponseData;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(BeersResponseData beersResponseData) {

            super.onPostExecute(beersResponseData);
            mAdapter.setBeers(beersResponseData.getData());

        }
    }

}
