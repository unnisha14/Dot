package com.example.dot;

import android.content.Intent;
import android.widget.Button;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import static androidx.core.content.ContextCompat.startActivity;

public class BackEndClass {
    private static int box, size, node;
    private static ArrayList<Integer>[] nodes;
    private static int player;
    private static Button playerButton;
    private static int player1;
    private static int player2;
    private static HashSet<Integer[]> combo;

    BackEndClass(Button playerButton, int box, int node, int size){
        this.playerButton = playerButton;
        this.box = box;
        this.node = node;
        this.size = size;
        player1 = player2 = 0;
        nodes = new ArrayList[node];
        for (int i = 0;i < node; i++)
            nodes[i] = new ArrayList<>();

        combo = new HashSet<Integer[]>();
    }

    public void nodesConnected(int x , int y){
        int z = detect_loop(x, y);
        nodes[x].add(y);
        nodes[y].add(x);
        //Toast.makeText(TwentyFiveBox.this,"z = " + z,Toast.LENGTH_SHORT).show();

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

        /*if (combo.size() == box){
            //Toast.makeText(SixteenBox.this,"Done",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(BackEndClass.this, Winner.class);
            int info;
            if (player1 == player2)
                info = 0;
            else
                info = player1 > player2 ? 1 : 2;
            intent.putExtra("winner", info);
            startActivity(intent);
            finish();
        }*/
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

    public int getComboSize(){
        return combo.size();
    }

    public int getBox() {
        return box;
    }

    public int getPlayer1() {
        return player1;
    }

    public int getPlayer2() {
        return player2;
    }
}
