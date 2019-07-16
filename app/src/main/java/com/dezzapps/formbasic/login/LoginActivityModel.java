package com.dezzapps.formbasic.login;

import com.dezzapps.formbasic.entities.User;

public class LoginActivityModel implements LoginActivityMVP.Model {

    private LoginRepository repository;

    public  LoginActivityModel(LoginRepository repository){
        this.repository = repository;
    }
    @Override
    public void createUser(String username, String password) {
        //Logica y validacion aqui
        repository.setUser(new User(username, password));
    }

    @Override
    public User getUser() {
        //Logica y validacion aqui
        return repository.getUser();
    }
}
