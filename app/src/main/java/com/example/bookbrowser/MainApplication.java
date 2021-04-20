package com.example.bookbrowser;

import android.app.Application;




public class MainApplication extends Application {

    public ApplicationComponent injector;
    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerApplicationComponent.create();
    }
}