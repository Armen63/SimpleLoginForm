package com.example.simpleloginform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simpleloginform.model.User;

public class LoginActivity extends AppCompatActivity {

    Button button;
    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextView) findViewById(R.id.etUsername);
        password = (TextView) findViewById(R.id.etPassword);
        button = (Button) findViewById(R.id.bLogin);

    }

    public void login(View view) {
        User user = new User();
        user.generateMap();
        Intent intent = new Intent(this, MainActivity.class);
        String getUsername = username.getText().toString();
        for (String str : user.getLoginPass().keySet()) {
            if (username.getText().toString().equals(str)) {
                if (password.getText().toString().equals(user.getLoginPass().get(str))){
                    intent.putExtra("message", getUsername);
                    startActivity(intent);
                }
                 else
                     Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }
}