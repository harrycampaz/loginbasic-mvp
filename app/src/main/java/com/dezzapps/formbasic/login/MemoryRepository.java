package com.dezzapps.formbasic.login;

import com.dezzapps.formbasic.entities.User;


public class MemoryRepository implements  LoginRepository {

    private User user;
    @Override
    public void setUser(User user) {

        if(user == null){
            user = getUser();
        }
        this.user = user;

    }

    @Override
    public User getUser() {
        if(user == null){
            user = new User("Harry", "12345678");
            user.setId(0);
            return  user;
        }else {
            return  user;
        }
    }
}
