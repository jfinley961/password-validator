package com.example.justin.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clearEditText(View view){
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
    }
    public void testPassword(View view){
        EditText edit = (EditText)findViewById(R.id.editText);
        TextView text = (TextView)findViewById(R.id.textView);
        String password = edit.getText().toString();
        if(passwordStrength(password))
            text.setText("Password is Strong");
        else
            text.setText("Password is Weak");
    }
    public static boolean passwordStrength(String password){
        boolean containsLowerCase = false;
        boolean containsUpperCase = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;
        if(password.equals("password"))
            return false;
        else if(password.length()<8)
            return false;
        for(int i=0; i<password.length(); i++){
            if(isLowerCase(password.charAt(i)))
                containsLowerCase = true;
            if(isUpperCase(password.charAt(i)))
                containsUpperCase = true;
            if(isNumber(password.charAt(i)))
                containsNumber = true;
            if(isSpecialCharacter(password.charAt(i)))
                containsSpecialCharacter = true;
        }
        return containsLowerCase && containsUpperCase && containsNumber && containsSpecialCharacter;
    }
    public static boolean isLowerCase(char c){
        return (int) c >= (int) 'a' && (int) c <= (int) 'z';
    }
    public static boolean isUpperCase(char c){
        return (int) c >= (int) 'A' && (int) c <= (int) 'Z';
    }
    public static boolean isNumber(char c){
        return (int) c >= (int) '0' && (int) c <= (int) '9';
    }
    public static boolean isSpecialCharacter(char c){
        if((int) c >=33 && (int) c <=47)
            return true;
        else if((int) c >=58 && (int) c <=64)
            return true;
        else if((int) c >=91 && (int) c <=96)
            return true;
        else if((int) c >=123 && (int) c <=126)
            return true;
        return false;
    }
}
