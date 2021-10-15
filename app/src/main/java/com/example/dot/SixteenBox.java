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

import static java.util.Collections.swap;

public class SixteenBox extends AppCompatActivity {
    private Button startButton, playerButton;
    private int size, player, box, node;
    private static ArrayList<Integer>[] nodes;
    private static int player1;
    private static int player2, z;
    private static HashSet<Integer[]> combo;
    private List<Button> lines;
    private Integer[] visited;

    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @SuppressLint("ResourceAsColor")
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {
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
                    x = 4;
                    y = 5;
                    id = 3;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line5:
                    x = 1;
                    y = 6;
                    id = 4;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line6:
                    x = 2;
                    y = 7;
                    id = 5;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line7:
                    x = 3;
                    y = 8;
                    id = 6;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line8:
                    x = 4;
                    y = 9;
                    id = 7;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line9:
                    x = 5;
                    y = 10;
                    id = 8;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line10:
                    x = 6;
                    y = 7;
                    id = 9;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line11:
                    x = 7;
                    y = 8;
                    id = 10;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line12:
                    x = 8;
                    y = 9;
                    id = 11;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line13:
                    x = 9;
                    y = 10;
                    id = 12;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line14:
                    x = 6;
                    y = 11;
                    id = 13;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line15:
                    x = 7;
                    y = 12;
                    id = 14;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line16:
                    x = 8;
                    y = 13;
                    id = 15;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line17:
                    x = 9;
                    y = 14;
                    id = 16;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "17", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line18:
                    x = 10;
                    y = 15;
                    id = 17;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "18", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line19:
                    x = 11;
                    y = 12;
                    id = 18;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "19", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line20:
                    x = 12;
                    y = 13;
                    id = 19;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "20", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line21:
                    x = 13;
                    y = 14;
                    id = 20;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "21", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line22:
                    x = 14;
                    y = 15;
                    id = 21;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "22", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line23:
                    x = 11;
                    y = 16;
                    id = 22;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "23", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line24:
                    x = 12;
                    y = 17;
                    id = 23;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "24", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line25:
                    x = 13;
                    y = 18;
                    id = 24;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line26:
                    x = 14;
                    y = 19;
                    id = 25;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line27:
                    x = 15;
                    y = 20;
                    id = 26;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line28:
                    x = 16;
                    y = 17;
                    id = 27;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line29:
                    x = 17;
                    y = 18;
                    id = 28;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line30:
                    x = 18;
                    y = 19;
                    id = 29;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line31:
                    x = 19;
                    y = 20;
                    id = 30;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line32:
                    x = 16;
                    y = 21;
                    id = 31;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line33:
                    x = 17;
                    y = 22;
                    id = 32;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line34:
                    x = 18;
                    y = 23;
                    id = 33;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line35:
                    x = 19;
                    y = 24;
                    id = 34;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line36:
                    x = 20;
                    y = 25;
                    id = 35;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line37:
                    x = 21;
                    y = 22;
                    id = 36;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line38:
                    x = 22;
                    y = 23;
                    id = 37;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line39:
                    x = 23;
                    y = 24;
                    id = 38;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line40:
                    x = 24;
                    y = 25;
                    id = 39;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
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
                nodesConnected(x, y);
            }
            else
                Toast.makeText(SixteenBox.this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    };

    public void nodesConnected(int x , int y){
        z = detect_loop(x, y);
        nodes[x].add(y);
        nodes[y].add(x);
        //Toast.makeText(BackEndClass.this, Integer.toString(z), Toast.LENGTH_SHORT).show();

        if (z == -1){
            player = player * z;
            if (player == 1)
                playerButton.setText("Player 1");
            else
                playerButton.setText("Player 2");
        }
        else{
            if (player == 1)
                player1+=z;
            else
                player2+=z;
            //Toast.makeText(SixteenBox.this,"player 1 = " + player1 + "player2 = " + player2,Toast.LENGTH_SHORT).show();
        }

        if (combo.size() == box){
            Intent intent = new Intent(SixteenBox.this, Winner.class);
            int info;
            if (player1 == player2)
                info = 0;
            else if (player1 > player2)
                info = 1;
            else
                info = 2;
            intent.putExtra("winner", info);
            startActivity(intent);
            finish();
        }
    }

    private static int detect_loop(int x , int y) {
        boolean flag = false;
        int i = 0, j = 0,count = 0;

        for (i = 0; i < nodes[x].size(); i++) {
            int k = nodes[x].get(i);
            for (j = 0; j < nodes[y].size(); j++) {
                if (nodes[k].contains(nodes[y].get(j)) == true) {
                    Integer arr[] = new Integer[4];
                    arr[0] = x;
                    arr[1] = y;
                    arr[2] = nodes[x].get(i);
                    arr[3] = nodes[y].get(j);
                    combo.add(arr);
                    flag = true;
                    count++;
                }
            }
        }

        if (flag == true){
            return count;
        }

        return -1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen_box);

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
        lines.add(findViewById(R.id.line25));
        lines.add(findViewById(R.id.line26));
        lines.add(findViewById(R.id.line27));
        lines.add(findViewById(R.id.line28));
        lines.add(findViewById(R.id.line29));
        lines.add(findViewById(R.id.line30));
        lines.add(findViewById(R.id.line31));
        lines.add(findViewById(R.id.line32));
        lines.add(findViewById(R.id.line33));
        lines.add(findViewById(R.id.line34));
        lines.add(findViewById(R.id.line35));
        lines.add(findViewById(R.id.line36));
        lines.add(findViewById(R.id.line37));
        lines.add(findViewById(R.id.line38));
        lines.add(findViewById(R.id.line39));
        lines.add(findViewById(R.id.line40));

        size = lines.size();
        node = 26;
        box = 16;
        player = 1;
        nodes = new ArrayList[node];
        for (int i = 0; i < node; i++) {
            nodes[i] = new ArrayList<Integer>();
        }
        combo = new HashSet<>();

        visited = new Integer[size];
        Arrays.fill(visited, 0);

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