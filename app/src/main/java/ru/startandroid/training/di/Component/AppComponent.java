package ru.startandroid.training.di.Component;

import dagger.Component;
import ru.startandroid.training.Car;
import ru.startandroid.training.MainActivity;
import ru.startandroid.training.di.module.CarModule;
import ru.startandroid.training.di.module.EngineModule;

/**
 * Created by root on 24.01.2017.
 */

@Component (modules = {CarModule.class, EngineModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(Car car);
}
