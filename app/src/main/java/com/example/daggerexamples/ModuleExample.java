package com.example.daggerexamples;

import com.example.daggerexamples.NonInjectableClasses.NonInjectClass1;
import com.example.daggerexamples.NonInjectableClasses.NonInjectClass2;

public class ModuleExample {
    NonInjectClass1 nonInjectClass1;
    NonInjectClass2 nonInjectClass2;

    public ModuleExample(NonInjectClass1 nonInjectClass1,NonInjectClass2 nonInjectClass2){
        this.nonInjectClass1 = nonInjectClass1;
        this.nonInjectClass2 = nonInjectClass2;
    }
}
