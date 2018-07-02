package com.finkacho.login_mvp_pattern.Model;

public class User {
    private String email;
    private String password;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidDetails(){
        boolean isValid = true;

        if(!email.contains("@")) isValid = false;
        if(password.length() <= 6) isValid = false;

        return isValid;

    }
}
