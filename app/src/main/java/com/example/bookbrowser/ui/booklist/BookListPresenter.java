package com.example.bookbrowser.ui.booklist;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.ui.Presenter;

public class BookListPresenter implements Presenter<BookListScreen> {

    private BookListActivity bookListActivity = null;
    APIInteractor apiInteractor;

    @Override
    public void onAttach(BookListScreen screen){
        bookListActivity = (BookListActivity) screen;
    }

    @Override
    public void onDetach(){
        bookListActivity = null;
    }
}
