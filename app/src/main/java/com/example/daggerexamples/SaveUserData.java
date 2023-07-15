package com.example.daggerexamples;

import android.util.Log;

import javax.inject.Inject;

public class SaveUserData {

    @Inject
    public SaveUserData(){

    }
    public void SaveUser(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;

        Log.d("DaggerExample1","Data Saved Successfully "+" -> Name "+userName+" --> Email "+userEmail);
    }

    private String userName;
    private String userEmail;
}
