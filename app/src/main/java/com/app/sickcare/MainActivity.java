package com.app.sickcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    SickCareAdapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new SickCareAdapter(this, getSickCareList());
        mRecyclerView.setAdapter(mAdapter);

    }

    private ArrayList<SickCareItem> getSickCareList() {

        ArrayList<SickCareItem> models = new ArrayList<>();


        SickCareItem sci = new SickCareItem();
        sci.setmText1("news");
        sci.setmText2("feed");
        sci.setmImageResource(R.drawable.ic_face);
        models.add(sci);



        return models;

    }
}








