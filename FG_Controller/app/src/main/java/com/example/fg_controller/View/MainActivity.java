package com.example.fg_controller.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.fg_controller.R;
import com.example.fg_controller.ViewModel.ViewModel;
import com.example.fg_controller.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ViewModel viewModel = new ViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}