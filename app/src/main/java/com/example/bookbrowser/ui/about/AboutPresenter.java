package com.example.bookbrowser.ui.about;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.DatabaseInteractor;
import com.example.bookbrowser.ui.Presenter;

import javax.inject.Inject;


public class AboutPresenter implements Presenter<AboutScreen> {

    @Inject private AboutActivity aboutActivity = null;
    @Inject APIInteractor apiInteractor;
    @Inject DatabaseInteractor databaseInteractor;

    @Override
    public void onAttach(AboutScreen screen){
        aboutActivity = (AboutActivity) screen;
    }

    @Override
    public void onDetach(){
        aboutActivity = null;
    }
}
