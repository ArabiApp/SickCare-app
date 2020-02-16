package com.app.sickcare;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SickCareHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView  mImageView;
    TextView  mTextView1, mTextView2;
    ItemClickListener itemClickListener;

    public SickCareHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.imageView);

        this.mTextView1 = itemView.findViewById(R.id.textView1);
        this.mTextView2 = itemView.findViewById(R.id.textView2);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }

}
