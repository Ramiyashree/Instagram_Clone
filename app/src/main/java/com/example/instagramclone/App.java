package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MKcZU3SbZpom4SKYwc8xINfaVyf6gQoDfHu8xBRZ")
                // if defined
                .clientKey("MebkCWmSlSoCDPWJbNmmcte3sCx10I5I2eeg3X8V")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
