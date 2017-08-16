package com.example.nitishsingh.android83;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Nitish Singh on 19-07-2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Activity context;

    public ImageAdapter(Activity context ){
        this.context=context;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null);
        {

            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.gridview_activity, null);
        }


        ImageView imageView=(ImageView)view.findViewById(R.id.imageView2);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mThumbIds[i]);
        return view;
    }
    private Integer[] mThumbIds = {

            R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lollipop

    };
}
