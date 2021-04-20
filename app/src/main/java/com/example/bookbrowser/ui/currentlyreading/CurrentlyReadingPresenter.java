package com.example.bookbrowser.ui.currentlyreading;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.DatabaseInteractor;
import com.example.bookbrowser.ui.Presenter;

public class CurrentlyReadingPresenter implements Presenter<CurrentlyReadingScreen> {

    private CurrentlyReadingActivity currentlyReadingActivity = null;
    DatabaseInteractor databaseInteractor;
    APIInteractor apiInteractor;

    @Override
    public void onAttach(CurrentlyReadingScreen screen){
        currentlyReadingActivity = (CurrentlyReadingActivity) screen;
    }

    @Override
    public void onDetach(){
        currentlyReadingActivity = null;
    }
}
