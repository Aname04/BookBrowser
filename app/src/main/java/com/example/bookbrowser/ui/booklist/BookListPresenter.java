package com.example.bookbrowser.ui.booklist;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.ui.Presenter;

import javax.inject.Inject;

public class BookListPresenter implements Presenter<BookListScreen> {

    @Inject BookListScreen bookListScreen;
    @Inject APIInteractor apiInteractor;

    @Override
    public void onAttach(BookListScreen screen){
        bookListScreen = screen;
    }

    @Override
    public void onDetach(){
        bookListScreen = null;
    }
}
