package ru.startandroid.training.di.module;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.training.Car;

/**
 * Created by root on 24.01.2017.
 */

@Module
public class CarModule {

    @Provides
    Car provideCar(){
        return new Car();
    }
}
