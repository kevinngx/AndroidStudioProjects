package au.edu.unsw.infs3634.beers;

import android.util.Log;

import com.google.gson.Gson;

public class JsonConverter {
    private static final String TAG = "JsonConverter";

    public static Beer jsonToBeer(String jsonString) {

        Beer beer = new Gson().fromJson(jsonString, Beer.class);
        Log.d(TAG, "jsonToBeer: Created Beer:" + beer.toString());
        return beer;

    }
}
