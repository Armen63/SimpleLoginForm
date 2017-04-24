package com.example.simpleloginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.simpleloginform.model.User;

public class RegistrationActivity extends AppCompatActivity {

    Button button;
    EditText username;
    EditText password;
    EditText passwordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username = (EditText) findViewById(R.id.etUsernameReg);
        password = (EditText) findViewById(R.id.etPasswordReg);
        passwordConfirm= (EditText) findViewById(R.id.etPasswordConfReg);
    }

    public void registration(View view) {
        Intent intentReg = new Intent(this, MainActivity.class);
        User user = new User();
        String getUsername = username.getText().toString();
        String getPassword = password.getText().toString();
        String getPasswordConfirm = passwordConfirm.getText().toString();
        boolean usernameFree = true;
        for (String str : user.getMapOfLogPass().keySet()) {
            if(getUsername.equals(str))
                usernameFree = false;
        }
        Log.d("aasdasdas","ajdkhaskjdbaskjdlsbd");
        if((usernameFree == true) && (getPassword.equals(getPasswordConfirm))){
            user.getMapOfLogPass().put(getUsername,getPassword);
            intentReg.putExtra("message", getUsername);
            startActivity(intentReg);
        }
    }
}
