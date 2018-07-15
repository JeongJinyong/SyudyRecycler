package com.example.image.syudyrecycler;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearRecyclerAdapter linearRecyclerAdapter;
    GridRecyclerAdapter gridRecyclerAdapter;
    StGridRecyclerAdapter stGridRecyclerAdapter;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        int item = getIntent().getIntExtra("item",0);
        switch (item){
            case R.id.btn_linear:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                adapter = new LinearRecyclerAdapter(this, getItem());
                break;
            case R.id.btn_grid:
                recyclerView.setLayoutManager(new GridLayoutManager(this,2));
                adapter = new GridRecyclerAdapter(this,getItem());
                break;
            case R.id.btn_s_grid:
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
                adapter = new StGridRecyclerAdapter(this,getItem());
                break;
        }
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<RecyclerItem> getItem(){
        DataClass dataClass = new DataClass(this);
        ArrayList<RecyclerItem> items = new ArrayList<>();
        TypedArray img = dataClass.getImageList();
        String[] nm = dataClass.getNameList();
        String[] msg = dataClass.getMsgList();
        for(int i = 0; i < img.length(); i++){
            items.add(new RecyclerItem(getDrawable(img.getResourceId(i,-1)),nm[i],msg[i]));
        }
        return items;
    }
}
