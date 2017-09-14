package com.example.dell.maranon_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;


import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvAndroidVersion;
    int[] logo;
    String[] codename, version, api, date;
    ArrayList<AndroidVersion> list;
    CustomAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAndroidVersion = (RecyclerView) findViewById(R.id.chenny);
        logo = new int[] {R.drawable.androidcupcake, R.drawable.androiddonut, R.drawable.androideclair, R.drawable.androidfroyo,
                R.drawable.androidginger, R.drawable.androidhoneycomb, R.drawable.androidicecreamsandwich, R.drawable.androidjellybean,
                R.drawable.androidkitkat, R.drawable.androidlollipop, R.drawable.androidmarshmallow, R.drawable.androiudnougat, R.drawable.androidoreo};
        codename = getResources().getStringArray(R.array.codename);
        api = getResources().getStringArray(R.array.api);
        version = getResources().getStringArray(R.array.version);
        date = getResources().getStringArray(R.array.Date);
        list = new ArrayList<AndroidVersion>();

        layoutManager = new LinearLayoutManager(this);
        rvAndroidVersion.setLayoutManager(layoutManager);
        rvAndroidVersion.setHasFixedSize(true);


        for (int i = 0;i<codename.length; i++){
            list.add(new AndroidVersion(logo[i], codename[i], version[i], date[i], api[i]));
        }
        adapter = new CustomAdapter(list);
        rvAndroidVersion.setAdapter(adapter);


    }
}
