package com.example.daggerexamples;

import android.util.Log;

import javax.inject.Inject;

public class SendNotification {

    @Inject
    public SendNotification(){
    }

    // Method Injection Example
    public void sendNotify(UserRegistration userRegistration){
        Log.d("DaggerExample1","Notification Send Successfully");
    }
}
