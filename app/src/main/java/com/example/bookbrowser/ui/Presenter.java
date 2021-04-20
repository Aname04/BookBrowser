package com.example.bookbrowser.ui;

public interface Presenter<S> {
    void onAttach(S screen);
    void onDetach();
}
