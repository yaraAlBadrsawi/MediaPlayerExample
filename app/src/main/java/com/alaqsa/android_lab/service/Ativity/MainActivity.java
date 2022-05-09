package com.alaqsa.android_lab.service.Ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.alaqsa.android_lab.service.Service.MyMusicService;
import com.alaqsa.android_lab.service.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        binding.start.setOnClickListener(v ->
                startService(new Intent(MainActivity.this, MyMusicService.class)));

        binding.stop.setOnClickListener(v -> {
           //Intent intent= ;

           stopService(new Intent(MainActivity.this,MyMusicService.class));
        });


    }
}