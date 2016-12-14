package com.souke.mojing.ui.login;

import com.souke.mojing.base.IModel;
import com.souke.mojing.base.IPresenter;
import com.souke.mojing.base.IView;

/**
 * Created by Bob on 2016/12/7
 */
public interface LoginContract {

    interface Model extends IModel {

    }

    interface View extends IView {
        void loginSuccess();

        void signSuccess();

        void showMsg(String msg);
    }

    interface Presenter extends IPresenter<View> {

    }

}
