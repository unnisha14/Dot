package com.example.dot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    public int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0;i < 6;i++)
            arr.add(i + 1);

        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.grid_view, R.id.text, arr);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent , View view , int position , long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(MainActivity.this, OneBox.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, FourBox.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, NineBox.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, SixteenBox.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, TwentyFiveBox.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, ThirtySixBox.class));
                        break;
                }
            }
        });
    }
}