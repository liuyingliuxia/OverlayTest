package com.lingong.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.lingong.demo.databinding.ActivityMainBinding;

import java.util.Locale;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.d("main", "language = " + Locale.getDefault().getLanguage());
    }
}