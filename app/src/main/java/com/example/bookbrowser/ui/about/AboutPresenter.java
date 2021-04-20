package com.example.bookbrowser.ui.about;

import com.example.bookbrowser.APIInteractor;
import com.example.bookbrowser.DatabaseInteractor;
import com.example.bookbrowser.ui.Presenter;

import javax.inject.Inject;


public class AboutPresenter implements Presenter<AboutScreen> {

    @Inject AboutScreen aboutScreen;
    @Inject APIInteractor apiInteractor;
    @Inject DatabaseInteractor databaseInteractor;

    @Override
    public void onAttach(AboutScreen screen){
        aboutScreen = screen;
    }

    @Override
    public void onDetach(){
        aboutScreen = null;
    }
}
