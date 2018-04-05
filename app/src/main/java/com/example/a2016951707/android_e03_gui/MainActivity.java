package com.example.a2016951707.android_e03_gui;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // faz a ligação entre a ListView e o Adapter
        ListView languagesListView = findViewById(R.id.list);
        languagesListView.setAdapter(new listViewAdapter(this) {
        });


    }
}
