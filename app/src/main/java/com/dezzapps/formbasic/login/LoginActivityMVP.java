package com.dezzapps.formbasic.login;

import com.dezzapps.formbasic.entities.User;

public interface LoginActivityMVP {

    interface Model{

        void createUser(String username, String password);
        User getUser();
    }
    interface View{

        String getUsername();
        String getPassword();

        void showUserNotAvalible();
        void showInputError();
        void showUserSaved();

        void setUsername(String username);
        void setPassword(String password);


    }
    interface  Presenter{

        void setView(LoginActivityMVP.View view);
        void loginButtonCLicked();

        void getCurrentUser();


    }
}
