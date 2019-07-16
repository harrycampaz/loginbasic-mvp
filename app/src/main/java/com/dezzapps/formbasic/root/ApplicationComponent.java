package com.dezzapps.formbasic.root;

import com.dezzapps.formbasic.login.LoginActivity;
import com.dezzapps.formbasic.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);

}
