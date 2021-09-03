package com.sky.recyclerviewheader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sky.recyclerviewheader.ProductTest.DataSource;
import com.sky.recyclerviewheader.ProductTest.TimelineAdapter;
import com.sky.recyclerviewheader.ProductTest.TimelineItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    public List<TimelineItem> mData;
    TimelineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        getListData();
        adapter = new TimelineAdapter(this,mData);
        mRecyclerView.setAdapter(adapter);
        
    }

    private void getListData() {
        mData = DataSource.getTimeLineData();
    }
}