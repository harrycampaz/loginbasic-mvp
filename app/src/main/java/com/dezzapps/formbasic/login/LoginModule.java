package com.dezzapps.formbasic.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public  LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return  new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model providerLoginActivityModel(LoginRepository repository){
        return  new LoginActivityModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return  new MemoryRepository();
    }
}
