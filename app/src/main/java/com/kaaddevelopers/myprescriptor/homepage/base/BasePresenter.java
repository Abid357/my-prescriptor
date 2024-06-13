package com.kaaddevelopers.myprescriptor.homepage.base;

/**
 * Created by Abid-Temp on 09-Jan-18.
 */

public interface BasePresenter<T> {
    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void dropView();
}
