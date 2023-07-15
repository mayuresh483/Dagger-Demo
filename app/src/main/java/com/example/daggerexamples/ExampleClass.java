package com.example.daggerexamples;

import android.app.Application;

import com.example.daggerexamples.Dagger.DaggerIUserDagger;
import com.example.daggerexamples.Dagger.IUserDagger;
import com.example.daggerexamples.Dagger.MWhatAppConfirmation;

public class ExampleClass extends Application {
    private IUserDagger component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerIUserDagger.builder().mWhatAppConfirmation(new MWhatAppConfirmation(101110)).build();
        component.getUserRegistration();
    }

    public IUserDagger getComponent() {
        return component;
    }
}
