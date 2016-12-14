package com.souke.mojing.base;

/**
 * Created by Bob on 2016/12/7
 */
public interface IPresenter<T extends IView> {
    void attachView(T view);

    void start();

    void detachView();
}
