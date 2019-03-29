package com.example.flickr_browser;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Create an enum for all of the States this class can be in
enum DownloadStatus { IDLE, PROCESSING, NOT_INITIALISED, FAILED_OR_EMPTY, OK }

class GetRawData extends AsyncTask<String, Void, String> {
    private static final String TAG = "GetRawData";
    private final OnDownloadComplete mCallback;

    interface OnDownloadComplete {
        void onDownloadComplete(String data, DownloadStatus status);
    }

    private DownloadStatus mDownloadStatus;

    public GetRawData(OnDownloadComplete callback) {
        this.mDownloadStatus = DownloadStatus.IDLE;
        mCallback = callback;
    }

    @Override
    protected void onPostExecute(String s) {
        if (mCallback != null) {
            mCallback.onDownloadComplete(s, mDownloadStatus);
        }
        Log.d(TAG, "onPostExecute: parameter = " + s);

    }

    @Override
    protected String doInBackground(String... strings) {
        Log.d(TAG, "doInBackground: Started");
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        // Checks if we have gotten a URL, returns null if we got none
        if (strings == null) {
            mDownloadStatus = DownloadStatus.NOT_INITIALISED;
            return null;
        }

        try {
            // Get the URL from the String array that is passsed in as a parameter
            mDownloadStatus = DownloadStatus.PROCESSING;
            URL url = new URL(strings[0]);

            // Creates a connection using the URL, and set it to a "GET" request
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int response = connection.getResponseCode();
            Log.d(TAG, "doInBackground: The response code was: " + response);

            // Setting up our buffered reader to read data from the input stream, and adding that to the string builder
            StringBuilder result = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read the code one line at a time
            String line;
            while (null != (line = reader.readLine())) {
                // Note the "\n" is stripped off when we use readLine() --> as such we need to append the "\n"
                result.append(line).append("\n");
            }

            mDownloadStatus = DownloadStatus.OK;
            return result.toString();

        } catch (MalformedURLException e) {
            Log.e(TAG, "doInBackground: Invalid URL" + e.getMessage());
        } catch (IOException e) {
            Log.e(TAG, "doInBackground: IO Exception reading data" + e.getMessage());
        } catch (SecurityException e) {
            Log.e(TAG, "doInBackground: Security Exception. Needs Permission?" + e.getMessage());
        } finally {
            // A finally block is run regardless of wether or not an exception is thrown
            // NOT --> a finally block will run BEFORE the return statement in the ordinary flow
            if (connection != null) {
                connection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    Log.e(TAG, "doInBackground: Error closing stream " + e.getMessage());
                }
            }

        }

        return null;
    }
}
