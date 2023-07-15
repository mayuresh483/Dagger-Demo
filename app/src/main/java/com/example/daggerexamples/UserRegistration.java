package com.example.daggerexamples;

import android.util.Log;

import javax.inject.Inject;

public class UserRegistration {

    // Field Injection
    @Inject SaveUserData saveUserData;
    private SendConfirmationMail sendConfirmationMail;
    private SingletonClassDemo singletonClassDemo;

    @Inject
    public UserRegistration(SendConfirmationMail sendConfirmationMail,SingletonClassDemo singletonClassDemo){
        this.sendConfirmationMail = sendConfirmationMail;
        this.singletonClassDemo = singletonClassDemo;
    }

    public void userReg(String name, String email){
        sendConfirmationMail.sendMain();
        Log.d("DaggerExample1",this.singletonClassDemo +" Singleton Class"+this);
        saveUserData.SaveUser(name,email);
    }

    // Method Injection Example
    @Inject
    public void enableNotification(SendNotification sendNotification){
        sendNotification.sendNotify(this);
    }
}
