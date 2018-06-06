package com.example.jokemodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {
    private static final String TAG = "MainJokeActivity";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_main);
        textView = (TextView)findViewById(R.id.joke_tv);

        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("joke");
            Log.d(TAG, "onCreate: got message");
            textView.setText(message);
        }
    }
}
