package com.example.daggerexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexamples.Dagger.DaggerIUserDagger;
import com.example.daggerexamples.Dagger.IUserDagger;
import com.example.daggerexamples.Dagger.MWhatAppConfirmation;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Field Injection Declaration make sure the declared variable is not private
    @Inject UserRegistration userRegistration;
    @Inject UserRegistration userRegistration2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IUserDagger dagger = DaggerIUserDagger.builder().mWhatAppConfirmation(new MWhatAppConfirmation(100)).build();
        IUserDagger dagger = ((ExampleClass) getApplication()).getComponent();

        // Component & Provision Method
//        UserRegistration userRegistration = dagger.getUserRegistration();

        // Field Injection Implementation
        dagger.inject(this);

        userRegistration.userReg("Mayuresh","mayuresh483@gmail.com");
        userRegistration2.userReg("Mayuresh12","mayuresh2483@gmail.com");
    }
}