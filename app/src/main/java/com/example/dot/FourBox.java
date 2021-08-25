package com.example.dot;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourBox extends AppCompatActivity {
    private Button startButton, playerButton;
    private BackEndClass backEndClass;
    private int size;
    private List<Button> lines;
    private Integer[] visited;

    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @SuppressLint("ResourceAsColor")
        @Override
        public void onClick(View v) {
            int x, y, id;
            switch (v.getId()){
                case R.id.line1:
                    x =  1;
                    y = 2;
                    id = 0;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line2:
                    x = 2;
                    y = 3;
                    id = 1;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line3:
                    x = 1;
                    y = 4;
                    id = 2;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line4:
                    x = 2;
                    y = 5;
                    id = 3;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line5:
                    x = 3;
                    y = 6;
                    id = 4;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line6:
                    x = 4;
                    y = 5;
                    id = 5;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line7:
                    x = 5;
                    y = 6;
                    id = 6;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line8:
                    x = 4;
                    y = 7;
                    id = 7;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line9:
                    x = 5;
                    y = 8;
                    id = 8;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line10:
                    x = 6;
                    y = 9;
                    id = 9;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line11:
                    x = 7;
                    y = 8;
                    id = 10;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                case R.id.line12:
                    x = 8;
                    y = 9;
                    id = 11;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
                default:
                    x = 0;
                    y = 0;
                    id = -1;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    break;
            }

            //Toast.makeText(FourBox.this, "x = " + x + " y = " + y, Toast.LENGTH_SHORT).show();
            if (x == 0 && y == 0 && visited[id] == 1)
                Toast.makeText(FourBox.this, "Invalid", Toast.LENGTH_SHORT).show();
            else {
                visited[id] = 1;
                //Toast.makeText(ThirtySixBox.this, "x " + x + " y = " + y, Toast.LENGTH_SHORT).show();
                backEndClass.nodesConnected(x, y);
                int size = backEndClass.getComboSize();
                if (size == backEndClass.getBox()){
                    Intent intent = new Intent(FourBox.this, Winner.class);
                    int info;
                    if (backEndClass.getPlayer1() == backEndClass.getPlayer2())
                        info = 0;
                    else
                        info = backEndClass.getPlayer1() > backEndClass.getPlayer2() ? 1 : 2;
                    intent.putExtra("winner", info);
                    startActivity(intent);
                    finish();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_box);

        Button btn = (Button) findViewById(R.id.startBtn);
        playerButton = (Button) findViewById(R.id.player);
        List<Button> lines = new ArrayList<Button>();
        lines.add(findViewById(R.id.line1));
        lines.add(findViewById(R.id.line2));
        lines.add(findViewById(R.id.line3));
        lines.add(findViewById(R.id.line4));
        lines.add(findViewById(R.id.line5));
        lines.add(findViewById(R.id.line6));
        lines.add(findViewById(R.id.line7));
        lines.add(findViewById(R.id.line8));
        lines.add(findViewById(R.id.line9));
        lines.add(findViewById(R.id.line10));
        lines.add(findViewById(R.id.line11));
        lines.add(findViewById(R.id.line12));


        size = lines.size();

        visited = new Integer[size];
        Arrays.fill(visited, 0);

        backEndClass = new BackEndClass(playerButton, 4,10, size);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toast.makeText(FourBox.this, "view", Toast.LENGTH_SHORT).show();
                v.setVisibility(View.GONE);
                playerButton.setVisibility(View.VISIBLE);
                playerButton.setText("Player 1");
                for (int i = 0; i < 12; i++) {
                    lines.get(i).setOnClickListener(onClickListener);
                }
            }
        });
    }
}