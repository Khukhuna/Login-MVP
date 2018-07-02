package com.finkacho.login_mvp_pattern.Presenter;

import com.finkacho.login_mvp_pattern.Model.User;
import com.finkacho.login_mvp_pattern.View.LoginView;

public class LoginPresenter {

    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    public void onLogin(String email, String password){
        User user = new User(email, password);

        if(user.isValidDetails()){
            loginView.onLoginResult("Correct Data");
        }else{
            loginView.onLoginResult("Incorrect Data");
        }
    }
}
