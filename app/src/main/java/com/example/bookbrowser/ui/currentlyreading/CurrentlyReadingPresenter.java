package com.example.bookbrowser.ui.currentlyreading;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.DatabaseInteractor;
import com.example.bookbrowser.ui.Presenter;

import javax.inject.Inject;

public class CurrentlyReadingPresenter implements Presenter<CurrentlyReadingScreen> {

    @Inject CurrentlyReadingScreen currentlyReadingScreen= null;
    @Inject DatabaseInteractor databaseInteractor;
    @Inject APIInteractor apiInteractor;

    @Override
    public void onAttach(CurrentlyReadingScreen screen){
        currentlyReadingScreen = screen;
    }

    @Override
    public void onDetach(){
        currentlyReadingScreen = null;
    }
}
