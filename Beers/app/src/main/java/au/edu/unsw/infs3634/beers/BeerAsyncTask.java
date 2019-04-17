package au.edu.unsw.infs3634.beers;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BeerAsyncTask extends AsyncTask<Void, Void, BeersResponseData> {
    private static final String TAG = "BeerAsyncTask";

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected BeersResponseData doInBackground(Void... voids) {
        try {
            Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Beer.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            BreweryDbClient service = retrofit.create(BreweryDbClient.class);
            Call<BeersResponseData> beersCall = service.getBeerList(Beer.KEY, "Y");

            BeersResponseData beersResponseData = beersCall.execute().body();
//            try {
//                for (int i = 0; i < beersResponseData.getData().size(); i++) {
//                    Log.d(TAG, "onResponse: " + beersResponseData.getData().get(i).toString());
//                }
//            } catch (NullPointerException e) {
//                Log.d(TAG, "onResponse: NULL POINTER EXCEPTION");
//            }
            return beersResponseData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(BeersResponseData beersResponseData) {
        super.onPostExecute(beersResponseData);
    }
}
