package com.example.bookbrowser.ui.currentlyreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.MainApplication;
import com.example.bookbrowser.R;

import javax.inject.Inject;

public class CurrentlyReadingActivity extends AppCompatActivity implements CurrentlyReadingScreen {

    @Inject private CurrentlyReadingPresenter presenter = new CurrentlyReadingPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_reading);

        ((MainApplication) getApplicationContext()).injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onAttach(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onDetach();
    }
}
