package com.example.bookbrowser.ui.about;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.R;

public class AboutActivity extends AppCompatActivity implements AboutScreen {

    AboutPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
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
