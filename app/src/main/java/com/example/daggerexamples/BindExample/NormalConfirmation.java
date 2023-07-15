package com.example.daggerexamples.BindExample;

import android.util.Log;

import com.example.daggerexamples.SendConfirmationMail;

import javax.inject.Inject;

public class NormalConfirmation implements SendConfirmationMail {

    @Inject
    public NormalConfirmation(){

    }
    @Override
    public void sendMain() {
        Log.d("DaggerExample1","Normal Confirmation");
    }
}
