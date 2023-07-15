package com.example.daggerexamples.Dagger;

import com.example.daggerexamples.ModuleExample;
import com.example.daggerexamples.NonInjectableClasses.NonInjectClass1;
import com.example.daggerexamples.NonInjectableClasses.NonInjectClass2;

import dagger.Module;
import dagger.Provides;

@Module
public class MNonInjectDagger {

    @Provides
    NonInjectClass1 getNonInject1(){
        return new NonInjectClass1();
    }

    @Provides
    NonInjectClass2 getNonInject2(){
        NonInjectClass2 nonInjectClass2 = new NonInjectClass2();
        nonInjectClass2.getInject();
        return nonInjectClass2;
    }

    @Provides
    ModuleExample getModules(NonInjectClass1 nonInjectClass1, NonInjectClass2 nonInjectClass2){
        return new ModuleExample(nonInjectClass1,nonInjectClass2);
    }
}
