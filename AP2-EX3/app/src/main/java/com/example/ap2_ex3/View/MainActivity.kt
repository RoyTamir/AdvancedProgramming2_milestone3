package com.example.ap2_ex3.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ap2_ex3.R
import com.example.ap2_ex3.ViewModel.ViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vm: ViewModel = ViewModel()
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply{
            this.setLifecycleOwner(this@Main)
        };
        binding.setTemp(temperatureData); // generated setter based on the data in the layout file
    }
}