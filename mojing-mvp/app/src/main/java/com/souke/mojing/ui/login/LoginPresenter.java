package com.souke.mojing.ui.login;

import com.souke.mojing.base.BasePresenter;

/**
 * Created by Bob on 2016/12/7
 */
public class LoginPresenter extends BasePresenter<LoginContract.View, LoginContract.Model> implements LoginContract.Presenter {


    public LoginPresenter() {
        mModel = new LoginModel();
    }

    @Override
    public void start() {

    }
}
