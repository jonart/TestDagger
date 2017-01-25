package ru.startandroid.training;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    @Inject
    Engine mEngine;

    public Car(){
        App.getAppComponent().inject(this);
    }
    protected void makeCar(String carName, String engineName){
        mEngine.setModelEngine(engineName);
        Log.d("TAG", carName + " " + mEngine.getNameEngine());
    }
}
