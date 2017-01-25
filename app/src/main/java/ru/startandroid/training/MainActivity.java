package ru.startandroid.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent().inject(this);

        mCar.makeCar("Lada");
    }
}
