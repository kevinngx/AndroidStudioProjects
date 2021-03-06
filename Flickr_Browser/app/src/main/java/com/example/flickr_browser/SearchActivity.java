package com.example.flickr_browser;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.os.Bundle;
//import android.widget.SearchView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;



public class SearchActivity extends BaseActivity {
    private static final String TAG = "SearchActivity";
    private SearchView mSearchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: starts");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        activateToolbar(true);
        Log.d(TAG, "onCreate: ends");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu: starts");
        getMenuInflater().inflate(R.menu.menu_main, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        mSearchView = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        SearchableInfo searchableInfo = searchManager.getSearchableInfo(getComponentName());
        mSearchView.setSearchableInfo(searchableInfo);

        Log.d(TAG, "onCreateOptionsMenu: " + getComponentName().toString());
        Log.d(TAG, "onCreateOptionsMenu: hint is " + mSearchView.getQueryHint());
        Log.d(TAG, "onCreateOptionsMenu: searchable info is " + searchableInfo.toString());

        mSearchView.setIconified(true);

        Log.d(TAG, "onCreateOptionsMenu: returned " + true);
        return true;
    }

}
