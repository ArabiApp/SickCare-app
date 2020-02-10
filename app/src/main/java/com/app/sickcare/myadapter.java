/*  package com.app.sickcare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SickCareAdapter extends RecyclerView.Adapter<SickCareAdapter.SickCareViewHolder> {
    private ArrayList<SickCareItem> mSickCareList;

    public static class SickCareViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public SickCareViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public SickCareAdapter(ArrayList<SickCareItem> sickcareList) {
        mSickCareList = sickcareList;
    }

    @NonNull
    @Override
    public SickCareViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.android_item, parent, false);
        SickCareViewHolder svh = new SickCareViewHolder(v);
        return svh;
    }

    @Override
    public void onBindViewHolder(@NonNull SickCareViewHolder holder, int position) {
        SickCareItem currentItem = mSickCareList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mSickCareList.size();
    }
}
 */