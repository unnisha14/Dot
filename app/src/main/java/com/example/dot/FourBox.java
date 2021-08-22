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

    private ArrayList<Integer>[] nodes;
    private Integer[] visited;
    private int player1, player2, player;
    private HashSet<Integer[]> combo;
    private Button playerButton;

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
                nodesConnected(x, y);
                visited[id] = 1;
            }
        }
    };

    private void nodesConnected(int x , int y) {
        int z = detect_loop(x, y);
        nodes[x].add(y);
        nodes[y].add(x);

        if (z == -1){
            player = player*-1;
            if (player == 1)
                playerButton.setText("Player 1");
            else
                playerButton.setText("Player 2");
        }
        else{
            if (player == 1)
                player1++;
            else
                player2++;
        }

        if (combo.size() == 4){
            Intent intent = new Intent(FourBox.this, Winner.class);
            int info;
            if (player1 == player2)
                info = 0;
            else
                info = player1 > player2 ? 1 : 2;
            intent.putExtra("winner", info);
            startActivity(intent);
            finish();
        }
    }

    private int detect_loop(int x , int y) {
        boolean flag = false;
        int i = 0, j = 0;
        for (i = 0; i < nodes[x].size(); i++) {
            int k = nodes[x].get(i);
            for (j = 0; j < nodes[y].size(); j++) {
                if (nodes[k].contains(nodes[y].get(j)) == true)
                    break;
            }

            if (j != nodes[y].size()){
                flag = true;
                break;
            }
        }

        if (flag == true){
            Integer arr[] = new Integer[4];
            arr[0] = x;
            arr[1] = y;
            arr[2] = nodes[x].get(i);
            arr[3] = nodes[y].get(j);
            combo.add(arr);
            return 1;
        }

        return -1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_box);

        player = 1;
        player1 = 0;
        player2 = 0;

        visited = new Integer[12];
        Arrays.fill(visited, 0);

        nodes = new ArrayList[10];
        for (int i = 0;i < 10; i++)
            nodes[i] = new ArrayList<>();

        combo = new HashSet<Integer[]>();

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