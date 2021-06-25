package com.example.fg_controller.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.fg_controller.R;
import com.example.fg_controller.view_model.ViewModel;
import com.example.fg_controller.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Joystick joystick;
    private ViewModel viewModel;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        joystick = (Joystick) findViewById(R.id.joystick);
        joystick.onChange = (Float a, Float e) -> {
            viewModel.setA((double) a);
            viewModel.setElevator((double) e);
        };
        //joystick.onChange.accept((float) 1, (float) 1);
        viewModel.setThrottle(1000);
    }

    public void onClick_connect(View view) {
        System.out.println("port: " + viewModel.getPort());
        System.out.println("ip: " + viewModel.getIp());
        System.out.println("rudder: " + viewModel.getRudder());
        System.out.println("throttle: " + viewModel.getThrottle());
        System.out.println("aeliron: " + viewModel.getA());
        System.out.println("elevator: " + viewModel.getElevator());
    }
}