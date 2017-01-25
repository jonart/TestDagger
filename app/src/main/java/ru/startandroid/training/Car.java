package ru.startandroid.training;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by root on 24.01.2017.
 */

public class Car {

    @Inject
    Engine mEngine;

    public Car(){
        App.getAppComponent().inject(this);
    }
    void makeCar(String name){
        Log.d("TAG", name + " " + mEngine.getNameEngine());
    }
}
