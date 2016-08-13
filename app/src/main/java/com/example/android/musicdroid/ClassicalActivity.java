package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical);


        ArrayList<String> classical = new ArrayList<String>();

        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");
        classical.add("classical");



        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classical);

        ListView listView = (ListView) findViewById(R.id.classical);
        listView.setAdapter(itemsAdapter);


    }
}
