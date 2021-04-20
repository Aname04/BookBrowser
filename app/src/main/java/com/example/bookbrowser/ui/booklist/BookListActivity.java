package com.example.bookbrowser.ui.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookbrowser.R;

public class BookListActivity extends AppCompatActivity implements BookListScreen {

    BookListPresenter presenter;

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
