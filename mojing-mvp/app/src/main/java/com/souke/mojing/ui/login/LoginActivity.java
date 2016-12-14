package com.souke.mojing.ui.login;

import android.os.Bundle;

import com.souke.mojing.R;
import com.souke.mojing.base.BaseViewActivity;

public class LoginActivity extends BaseViewActivity<LoginPresenter> implements LoginContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected LoginPresenter newInstancePresenter() {
        return new LoginPresenter();
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void signSuccess() {

    }

    @Override
    public void showMsg(String msg) {

    }

}
