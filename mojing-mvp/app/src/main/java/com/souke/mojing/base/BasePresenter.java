package com.souke.mojing.base;

/**
 * Created by Bob on 2016/12/7
 */
public abstract class BasePresenter<T extends IView, M extends IModel> implements IPresenter<T>{

    protected T mView;
    protected M mModel;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public T getView() {
        return mView;
    }

    public M getModel() {
        return mModel;
    }
}
