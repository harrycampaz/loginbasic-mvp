package com.dezzapps.formbasic.root;

import android.app.Application;

import com.dezzapps.formbasic.login.LoginModule;
import com.dezzapps.formbasic.root.DaggerApplicationComponent;

public class App extends Application {
    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public  ApplicationComponent getComponent(){
        return  component;
    }
}
