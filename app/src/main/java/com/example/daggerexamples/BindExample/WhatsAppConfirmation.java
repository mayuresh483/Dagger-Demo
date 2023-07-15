package com.example.daggerexamples.BindExample;

import android.util.Log;

import com.example.daggerexamples.SendConfirmationMail;

import javax.inject.Inject;

public class WhatsAppConfirmation implements SendConfirmationMail {

    int data;

    @Inject
    public WhatsAppConfirmation(int data){
        this.data = data;
    }

    @Override
    public void sendMain() {
        Log.d("DaggerExample1","WhatsApp Confirmation "+this.data);
    }
}
