package au.edu.unsw.infs3634.beers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//https://sandbox-api.brewerydb.com/v2/beers/?key=0cafa2ad34d6df8c2e863a59c773394e&&withBreweries=Y

public interface BreweryDbClient {

    @GET("beers")
    Call<BeersResponseData> getBeerList(@Query("key") String key, @Query("withBreweries") String withBreweries);
}
