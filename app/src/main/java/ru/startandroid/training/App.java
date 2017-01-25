package ru.startandroid.training;

import android.app.Application;

import ru.startandroid.training.di.Component.AppComponent;
import ru.startandroid.training.di.Component.DaggerAppComponent;
import ru.startandroid.training.di.module.CarModule;
import ru.startandroid.training.di.module.EngineModule;

/**
 * Created by root on 24.01.2017.
 */

public class App extends Application {
    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .carModule(new CarModule())
                .build();
    }

    public static AppComponent getAppComponent() {return mAppComponent;}
}
