package com.example.mvvmpractice.viewmodel;

import androidx.databinding.BaseObservable;

import com.example.mvvmpractice.R;
import com.example.mvvmpractice.model.User;

public class Usermodel extends BaseObservable {//ei BaseObservable notify everything with id in xml
    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;
    private User user;
    public Usermodel(User user) {
        this.emailHint = user.emailHint;
        this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.emailEt);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passwordEt);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
