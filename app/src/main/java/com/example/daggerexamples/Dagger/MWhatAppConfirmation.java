package com.example.daggerexamples.Dagger;

import com.example.daggerexamples.BindExample.WhatsAppConfirmation;
import com.example.daggerexamples.SendConfirmationMail;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class MWhatAppConfirmation {

    int data;

    public MWhatAppConfirmation(int data) {
        this.data = data;
    }


    @Provides
    SendConfirmationMail getConfirmation(){
        return new WhatsAppConfirmation(data);
    };
}
