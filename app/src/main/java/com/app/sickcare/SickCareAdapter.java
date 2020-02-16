package com.app.sickcare;

import android.content.Context;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.BitSet;

public class SickCareAdapter extends RecyclerView.Adapter<SickCareHolder> {

    Context c;
    ArrayList<SickCareItem> models;


    public SickCareAdapter(Context c, ArrayList<SickCareItem> models) {
        this.c = c;
        this.models = models;
    }


    @NonNull
    @Override
    public SickCareHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.android_item, null);

        return new SickCareHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SickCareHolder holder, int i) {

        holder.mImageView.setImageResource(models.get(i).getmImageResource());
        holder.mTextView1.setText(models.get(i).getmText1());
        holder.mTextView2.setText(models.get(i).getmText2());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String gTextView1sc = models.get(position).getmText1();
                String gTextView2sc = models.get(position).getmText2();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) holder.mImageView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c, Main2Activity.class);
                intent.putExtra("iTextView1sc", gTextView1sc);
                intent.putExtra("iTextView2sc", gTextView2sc);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return models.size();
    }

}

