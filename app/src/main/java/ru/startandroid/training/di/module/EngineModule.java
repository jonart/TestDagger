package ru.startandroid.training.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.training.Engine;

/**
 * Created by root on 24.01.2017.
 */

@Module
public class EngineModule {

    @Provides
    Engine provideEngine(){
        return new Engine();
    }
}
