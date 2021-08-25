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

public class ThirtySixBox extends AppCompatActivity {
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
                    x = 5;
                    y = 6;
                    id = 4;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line6:
                    x = 6;
                    y = 7;
                    id = 5;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line7:
                    x = 1;
                    y = 8;
                    id = 6;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line8:
                    x = 2;
                    y = 9;
                    id = 7;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line9:
                    x = 3;
                    y = 10;
                    id = 8;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line10:
                    x = 4;
                    y = 11;
                    id = 9;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line11:
                    x = 5;
                    y = 12;
                    id = 10;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line12:
                    x = 6;
                    y = 13;
                    id = 11;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line13:
                    x = 7;
                    y = 14;
                    id = 12;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line14:
                    x = 8;
                    y = 9;
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
                    x = 12;
                    y = 13;
                    id = 17;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "18", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line19:
                    x = 13;
                    y = 14;
                    id = 18;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "19", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line20:
                    x = 18;
                    y = 15;
                    id = 19;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "20", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line21:
                    x = 9;
                    y = 16;
                    id = 20;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "21", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line22:
                    x = 10;
                    y = 17;
                    id = 21;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "22", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line23:
                    x = 11;
                    y = 18;
                    id = 22;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "23", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line24:
                    x = 12;
                    y = 19;
                    id = 23;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "24", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line25:
                    x = 13;
                    y = 20;
                    id = 24;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line26:
                    x = 14;
                    y = 21;
                    id = 25;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line27:
                    x = 15;
                    y = 16;
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
                    x = 20;
                    y = 21;
                    id = 31;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line33:
                    x = 15;
                    y = 22;
                    id = 32;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line34:
                    x = 16;
                    y = 23;
                    id = 33;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line35:
                    x = 17;
                    y = 24;
                    id = 34;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line36:
                    x = 18;
                    y = 25;
                    id = 35;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line37:
                    x = 19;
                    y = 26;
                    id = 36;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line38:
                    x = 20;
                    y = 27;
                    id = 37;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line39:
                    x = 21;
                    y = 28;
                    id = 38;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line40:
                    x = 22;
                    y = 23;
                    id = 39;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line41:
                    x = 23;
                    y = 24;
                    id = 40;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line42:
                    x = 24;
                    y = 25;
                    id = 41;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line43:
                    x = 25;
                    y = 26;
                    id = 42;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line44:
                    x = 26;
                    y = 27;
                    id = 43;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line45:
                    x = 27;
                    y = 28;
                    id = 44;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line46:
                    x = 22;
                    y = 29;
                    id = 45;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line47:
                    x = 23;
                    y = 30;
                    id = 46;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line48:
                    x = 24;
                    y = 31;
                    id = 47;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line49:
                    x = 25;
                    y = 32;
                    id = 48;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line50:
                    x = 26;
                    y = 33;
                    id = 49;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line51:
                    x = 27;
                    y = 34;
                    id = 50;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line52:
                    x = 28;
                    y = 35;
                    id = 51;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line53:
                    x = 29;
                    y = 30;
                    id = 52;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line54:
                    x = 30;
                    y = 31;
                    id = 53;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line55:
                    x = 31;
                    y = 32;
                    id = 54;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line56:
                    x = 32;
                    y = 33;
                    id = 55;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line57:
                    x = 33;
                    y = 34;
                    id = 56;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "17", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line58:
                    x = 34;
                    y = 35;
                    id = 57;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "18", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line59:
                    x = 29;
                    y = 36;
                    id = 58;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "19", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line60:
                    x = 30;
                    y = 37;
                    id = 59;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "20", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line61:
                    x = 31;
                    y = 38;
                    id = 60;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line62:
                    x = 32;
                    y = 39;
                    id = 61;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line63:
                    x = 33;
                    y = 40;
                    id = 62;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line64:
                    x = 34;
                    y = 41;
                    id = 63;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line65:
                    x = 35;
                    y = 42;
                    id = 64;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line66:
                    x = 36;
                    y = 37;
                    id = 65;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line67:
                    x = 37;
                    y = 38;
                    id = 66;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line68:
                    x = 38;
                    y = 39;
                    id = 67;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line69:
                    x = 39;
                    y = 40;
                    id = 68;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "9", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line70:
                    x = 40;
                    y = 41;
                    id = 69;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "10", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line71:
                    x = 41;
                    y = 42;
                    id = 70;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "11", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line72:
                    x = 36;
                    y = 43;
                    id = 71;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "12", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line73:
                    x = 37;
                    y = 44;
                    id = 72;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "13", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line74:
                    x = 38;
                    y = 45;
                    id = 73;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "14", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line75:
                    x = 39;
                    y = 46;
                    id = 74;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "15", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line76:
                    x = 40;
                    y = 47;
                    id = 75;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "16", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line77:
                    x = 41;
                    y = 48;
                    id = 76;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "17", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line78:
                    x = 42;
                    y = 49;
                    id = 77;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "18", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line79:
                    x = 43;
                    y = 44;
                    id = 78;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "19", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line80:
                    x = 44;
                    y = 45;
                    id = 79;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "20", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line81:
                    x = 45;
                    y = 46;
                    id = 80;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "21", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line82:
                    x = 46;
                    y = 47;
                    id = 81;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "22", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line83:
                    x = 47;
                    y = 48;
                    id = 82;
                    v.setBackgroundTintList(ColorStateList.valueOf(R.color.purple_200));
                    //Toast.makeText(NineBox.this, "23", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.line84:
                    x = 48;
                    y = 49;
                    id = 83;
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
                    Intent intent = new Intent(ThirtySixBox.this, Winner.class);
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
                Toast.makeText(ThirtySixBox.this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_six_box);

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
        lines.add(findViewById(R.id.line41));
        lines.add(findViewById(R.id.line42));
        lines.add(findViewById(R.id.line43));
        lines.add(findViewById(R.id.line44));
        lines.add(findViewById(R.id.line45));
        lines.add(findViewById(R.id.line46));
        lines.add(findViewById(R.id.line47));
        lines.add(findViewById(R.id.line48));
        lines.add(findViewById(R.id.line49));
        lines.add(findViewById(R.id.line50));
        lines.add(findViewById(R.id.line51));
        lines.add(findViewById(R.id.line52));
        lines.add(findViewById(R.id.line53));
        lines.add(findViewById(R.id.line54));
        lines.add(findViewById(R.id.line55));
        lines.add(findViewById(R.id.line56));
        lines.add(findViewById(R.id.line57));
        lines.add(findViewById(R.id.line58));
        lines.add(findViewById(R.id.line59));
        lines.add(findViewById(R.id.line60));
        lines.add(findViewById(R.id.line61));
        lines.add(findViewById(R.id.line62));
        lines.add(findViewById(R.id.line63));
        lines.add(findViewById(R.id.line64));
        lines.add(findViewById(R.id.line65));
        lines.add(findViewById(R.id.line66));
        lines.add(findViewById(R.id.line67));
        lines.add(findViewById(R.id.line68));
        lines.add(findViewById(R.id.line69));
        lines.add(findViewById(R.id.line70));
        lines.add(findViewById(R.id.line71));
        lines.add(findViewById(R.id.line72));
        lines.add(findViewById(R.id.line73));
        lines.add(findViewById(R.id.line74));
        lines.add(findViewById(R.id.line75));
        lines.add(findViewById(R.id.line76));
        lines.add(findViewById(R.id.line77));
        lines.add(findViewById(R.id.line78));
        lines.add(findViewById(R.id.line79));
        lines.add(findViewById(R.id.line80));
        lines.add(findViewById(R.id.line81));
        lines.add(findViewById(R.id.line82));
        lines.add(findViewById(R.id.line83));
        lines.add(findViewById(R.id.line84));

        size = lines.size();

        backEndClass = new BackEndClass(playerButton, 36, 50, size);

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