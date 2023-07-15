package com.example.daggerexamples.Dagger;

import com.example.daggerexamples.BindExample.WhatsAppConfirmation;
import com.example.daggerexamples.MainActivity;
import com.example.daggerexamples.UserRegistration;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {MNonInjectDagger.class, MWhatAppConfirmation.class})
public interface IUserDagger {
    UserRegistration getUserRegistration();

    // Field Injection if constructor can't be created
    void inject(MainActivity mainActivity);

}
