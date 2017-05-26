package com.example.justin.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static boolean passwordStrength(String password){
        if(password.equals("password"))
            return false;
        else if(password.length()<8)
            return false;
        return true;
    }
}
