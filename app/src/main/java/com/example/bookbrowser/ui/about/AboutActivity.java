package com.example.bookbrowser.ui.about;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.MainApplication;
import com.example.bookbrowser.R;

import javax.inject.Inject;

public class AboutActivity extends AppCompatActivity implements AboutScreen {

    @Inject private AboutPresenter presenter = new AboutPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

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
