package com.example.dot;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class OneBox extends AppCompatActivity {
    private TextView startButton;
    private Button l1, l2, l3, l4;
    private int lines[];

    View.OnClickListener onClickListener = new View.OnClickListener(){
        @SuppressLint("ResourceAsColor")
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public void onClick(View view) {
            int id = -1;
            view.setBackgroundTintList(ColorStateList.valueOf(R.color.lightorange));
            switch (view.getId()){
                case R.id.line1:
                    id = 0;
                    break;
                case R.id.line2:
                    id = 1;
                    break;
                case R.id.line3:
                    id = 2;
                    break;
                case R.id.line4:
                    id = 3;
                    break;
                default:
                    break;
            }

            arrayComplete(id);
            //Toast.makeText(OneBox.this,"id = " + id, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_box);

        lines = new int[] {0, 0, 0, 0};

        startButton = (TextView) findViewById(R.id.start);
        l1 = (Button) findViewById(R.id.line1);
        l2 = (Button) findViewById(R.id.line2);
        l3 = (Button) findViewById(R.id.line3);
        l4 = (Button) findViewById(R.id.line4);

        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.setVisibility(View.INVISIBLE);
                l1.setOnClickListener(onClickListener);
                l2.setOnClickListener(onClickListener);
                l3.setOnClickListener(onClickListener);
                l4.setOnClickListener(onClickListener);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void arrayComplete(int x){
        lines[x] = 1;
        //Toast.makeText(OneBox.this,"x = " + x, Toast.LENGTH_SHORT).show();

        IntStream stream = Arrays.stream(lines);
        int sum = stream.sum();

        if (sum == 4){
            Intent intent = new Intent(OneBox.this, Winner.class);
            intent.putExtra("winner", 2);
            startActivity(intent);
            finish();
        }
    }
}