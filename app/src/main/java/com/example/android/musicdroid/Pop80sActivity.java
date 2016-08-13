package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Pop80sActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop80s);


        ArrayList<String> pop80s = new ArrayList<String>();

        pop80s.add("Madonna: Like A Virgin");
        pop80s.add("Michael Jackson: Beat It");
        pop80s.add("aha Take On Me");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");
        pop80s.add("The 80s");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pop80s);

        ListView listView = (ListView) findViewById(R.id.pop80s);
        listView.setAdapter(itemsAdapter);
    }
}
