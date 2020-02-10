package com.app.sickcare;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView mTextView1sc, mTextView2sc;
    ImageView mImageViewsc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();

        mTextView1sc = findViewById(R.id.textView1sc);
        mTextView2sc = findViewById(R.id.textView2sc);
        mImageViewsc = findViewById(R.id.imageViewsc);

        Intent intent = getIntent();

        String mTextView1 = intent.getStringExtra("iTextView1sc");
        String mTextView2 = intent.getStringExtra("iTextView2sc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        actionBar.setTitle(mTextView1);

        mTextView1sc.setText(mTextView1);
        mTextView2sc.setText(mTextView2);
        mImageViewsc.setImageBitmap(bitmap);

    }
}
