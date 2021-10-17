package com.example.dot;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterClass extends ArrayAdapter<gridClass> {
    public AdapterClass(@NonNull Activity context , @NonNull List<gridClass> objects) {
        super(context , 0 , objects);
    }

    @NonNull
    @Override
    public View getView(int position , @Nullable View convertView , @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_view, parent,false);
        }

        gridClass curr = getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        imageView.setImageResource(curr.getImage());
        return convertView;
    }
}
