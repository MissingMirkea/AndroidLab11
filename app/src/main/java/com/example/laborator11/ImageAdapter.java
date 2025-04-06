package com.example.laborator11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.laborator11.R;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private final String[] mobileNames;
    private final int[] imageIds;

    public ImageAdapter(Context context, String[] mobileNames, int[] imageIds) {
        this.context = context;
        this.mobileNames = mobileNames;
        this.imageIds = imageIds;
    }

    @Override
    public int getCount() {
        return mobileNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if (convertView == null) {
            gridView = inflater.inflate(R.layout.grid_item, null);

            // Setează textul
            TextView textView = gridView.findViewById(R.id.grid_item_label);
            textView.setText(mobileNames[position]);

            // Setează imaginea
            ImageView imageView = gridView.findViewById(R.id.grid_item_image);
            imageView.setImageResource(imageIds[position]);
        } else {
            gridView = convertView;
        }

        return gridView;
    }
}
