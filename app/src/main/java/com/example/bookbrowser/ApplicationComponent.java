package com.example.bookbrowser;

import com.example.bookbrowser.ui.about.AboutActivity;
import com.example.bookbrowser.ui.booklist.BookListActivity;
import com.example.bookbrowser.ui.currentlyreading.CurrentlyReadingActivity;

import dagger.Component;

@Component
public interface ApplicationComponent {
    void inject(AboutActivity aboutActivity);
    void inject(BookListActivity bookListActivity);
    void inject(CurrentlyReadingActivity currentlyReadingActivity);
}
