package com.dezzapps.formbasic.login;

import androidx.annotation.Nullable;

import com.dezzapps.formbasic.entities.User;

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    @Nullable
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public  LoginActivityPresenter(LoginActivityMVP.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonCLicked() {
        if(view != null){
            if(view.getPassword().trim().equals("") || view.getPassword().trim().equals("")){
                view.showInputError();
            } else {
                model.createUser(view.getUsername().trim(), view.getPassword().trim());
                view.showUserSaved();
            }
        }
    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();
        if(user != null){
            if(view != null){
                view.showUserNotAvalible();
            }
        } else {
            if(view != null){
                view.setUsername(user.getUsername());
                view.setPassword(user.getPassword());
            }
        }
    }
}
