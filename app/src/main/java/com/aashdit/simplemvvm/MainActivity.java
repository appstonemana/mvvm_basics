package com.aashdit.simplemvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.aashdit.simplemvvm.databinding.ActivityMainBinding;
import com.aashdit.simplemvvm.model.User;
import com.aashdit.simplemvvm.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserViewModel userViewModel = ViewModelProviders.of(this,new UserViewModelFactory(this,new User()))
                .get(UserViewModel.class);
//        UserViewModel userViewModel = ViewModelProviders.of(this,new User()).get(UserViewModel.class);
        binding.setUserModel(userViewModel);
    }
}