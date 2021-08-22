package com.example.dot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        Intent intent = getIntent();
        int player = intent.getExtras().getInt("winner");

        textView = (TextView) findViewById(R.id.winner);
        String winner = "Player " + Integer.toString(player);
        if (player == 0)
            textView.setText("Draw Game");
        else
            textView.setText(winner);
    }
}