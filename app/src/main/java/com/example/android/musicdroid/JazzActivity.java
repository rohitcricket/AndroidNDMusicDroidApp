package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        ArrayList<String> jazz = new ArrayList<String>();

        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");
        jazz.add("jazz");




        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jazz);

        ListView listView = (ListView) findViewById(R.id.jazz);
        listView.setAdapter(itemsAdapter);


    }
}
