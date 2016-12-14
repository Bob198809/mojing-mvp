package com.souke.mojing.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bob on 2016/12/7
 */
public abstract class BaseViewActivity<P extends IPresenter> extends AppCompatActivity implements IView {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = newInstancePresenter();
        if (null != mPresenter) {
            mPresenter.attachView(this);
            mPresenter.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (null != mPresenter) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    public P getPresenter() {
        return mPresenter;
    }

    protected abstract P newInstancePresenter();
}
