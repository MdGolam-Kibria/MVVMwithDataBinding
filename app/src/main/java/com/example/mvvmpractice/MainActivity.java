package com.example.mvvmpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvmpractice.commands.UserLogin;
import com.example.mvvmpractice.databinding.ActivityMainBinding;
import com.example.mvvmpractice.model.User;
import com.example.mvvmpractice.viewmodel.Usermodel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Usermodel usermodel = new Usermodel(new User("Enter your email","Enter your password"));
        activityMainBinding.setLogin(usermodel);
        activityMainBinding.setUserLoginEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, ""+activityMainBinding.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, ""+activityMainBinding.getLogin().getPassword(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}