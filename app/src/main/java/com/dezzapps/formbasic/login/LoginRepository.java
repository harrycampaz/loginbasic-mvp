package com.dezzapps.formbasic.login;

import com.dezzapps.formbasic.entities.User;

public interface LoginRepository {

    void setUser(User user);
    User getUser();
}
