package com.example.bookbrowser.ui.currentlyreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.R;

public class CurrentlyReadingActivity extends AppCompatActivity implements CurrentlyReadingScreen {

    CurrentlyReadingPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_reading);
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
