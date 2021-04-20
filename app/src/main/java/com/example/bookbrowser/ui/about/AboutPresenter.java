package com.example.bookbrowser.ui.about;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.DatabaseInteractor;
import com.example.bookbrowser.ui.Presenter;

public class AboutPresenter implements Presenter<AboutScreen> {

    private AboutActivity aboutActivity = null;
    APIInteractor apiInteractor;
    DatabaseInteractor databaseInteractor;

    @Override
    public void onAttach(AboutScreen screen){
        aboutActivity = (AboutActivity) screen;
    }

    @Override
    public void onDetach(){
        aboutActivity = null;
    }
}
