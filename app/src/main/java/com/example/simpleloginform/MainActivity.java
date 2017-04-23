package com.example.simpleloginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");

        TextView username = (TextView) findViewById(R.id.twAfterLogin);
        username.setText(message);

    }
}
