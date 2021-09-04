package com.example.firstoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.firstoop.text.TextFunction;

public class MainActivity extends AppCompatActivity {
// TODO example
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int counter = 0; counter < 8; counter++) {
            Log.d("MainActivity", "counter = " + counter);
        }

        displayText();
    }

    private void displayText() {
        TextFunction tf = new TextFunction();
        TextView nt = findViewById(R.id.test);
        nt.setText(tf.getValue());
    }
}