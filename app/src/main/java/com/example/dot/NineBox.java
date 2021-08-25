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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NineBox extends AppCompatActivity {
    private Button startButton, playerButton;
    private BackEndClass backEndClass;
    private int size;
    private List<Button> lines;
    private Integer[] visited;

    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @SuppressLint("ResourceAsColor")
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {
            //Toast.makeText(NineBox.this, " View " + v.getId(), Toast.LENGTH_SHORT).show();
            int x, y, id;
            x = y = id = -1;
            switch (v.getId()){
                case R.id.line1:
                    x = 1;
                    y = 2;
                    id = 0;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line2:
                    x = 2;
                    y = 3;
                    id = 1;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line3:
                    x = 3;
                    y = 4;
                    id = 2;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line4:
                    x = 1;
                    y = 5;
                    id = 3;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line5:
                    x = 2;
                    y = 6;
                    id = 4;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line6:
                    x = 3;
                    y = 7;
                    id = 5;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line7:
                    x = 4;
                    y = 8;
                    id = 6;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line8:
                    x = 5;
                    y = 6;
                    id = 7;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line9:
                    x = 6;
                    y = 7;
                    id = 8;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line10:
                    x = 7;
                    y = 8;
                    id = 9;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line11:
                    x = 5;
                    y = 9;
                    id = 10;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line12:
                    x = 6;
                    y = 10;
                    id = 11;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line13:
                    x = 7;
                    y = 11;
                    id = 12;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line14:
                    x = 8;
                    y = 12;
                    id = 13;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line15:
                    x = 9;
                    y = 10;
                    id = 14;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line16:
                    x = 10;
                    y = 11;
                    id = 15;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line17:
                    x = 11;
                    y = 12;
                    id = 16;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "17", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line18:
                    x = 9;
                    y = 13;
                    id = 17;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "18", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line19:
                    x = 10;
                    y = 14;
                    id = 18;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "19", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line20:
                    x = 11;
                    y = 15;
                    id = 19;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "20", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line21:
                    x = 12;
                    y = 16;
                    id = 20;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "21", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line22:
                    x = 13;
                    y = 14;
                    id = 21;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "22", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line23:
                    x = 14;
                    y = 15;
                    id = 22;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "23", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line24:
                    x = 15;
                    y = 16;
                    id = 23;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "24", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    x = -1;
                    y = -1;
                    id = -1;
                    //Toast.makeText(NineBox.this, "Default ", Toast.LENGTH_SHORT).show();
                    break;
            }

            if (id != -1 && visited[id] == 0){
                visited[id] = 1;
                //Toast.makeText(ThirtySixBox.this, "x " + x + " y = " + y, Toast.LENGTH_SHORT).show();
                backEndClass.nodesConnected(x, y);
                int size = backEndClass.getComboSize();
                if (size == backEndClass.getBox()){
                    Intent intent = new Intent(NineBox.this, Winner.class);
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
            else
                Toast.makeText(NineBox.this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_box);

        startButton = (Button) findViewById(R.id.startBtn);
        playerButton = (Button) findViewById(R.id.player);

        lines = new ArrayList<Button>();
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
        lines.add(findViewById(R.id.line13));
        lines.add(findViewById(R.id.line14));
        lines.add(findViewById(R.id.line15));
        lines.add(findViewById(R.id.line16));
        lines.add(findViewById(R.id.line17));
        lines.add(findViewById(R.id.line18));
        lines.add(findViewById(R.id.line19));
        lines.add(findViewById(R.id.line20));
        lines.add(findViewById(R.id.line21));
        lines.add(findViewById(R.id.line22));
        lines.add(findViewById(R.id.line23));
        lines.add(findViewById(R.id.line24));

        size = lines.size();

        visited = new Integer[size];
        Arrays.fill(visited, 0);

        backEndClass = new BackEndClass(playerButton, 9,17, size);

        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startButton.setVisibility(View.GONE);
                playerButton.setVisibility(View.VISIBLE);
                playerButton.setText("Player 1");

                for (int i = 0;i < size; i++)
                    lines.get(i).setOnClickListener(onClickListener);
            }
        });
    }
}