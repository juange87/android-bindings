package com.example.juange.myapplication;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.juange.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Test", "User");
        binding.setUser(user);
    }
}
