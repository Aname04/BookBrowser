package com.example.bookbrowser.ui.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.R;

import javax.inject.Inject;

public class BookListActivity extends AppCompatActivity implements BookListScreen {

    @Inject private BookListPresenter presenter = new BookListPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
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
