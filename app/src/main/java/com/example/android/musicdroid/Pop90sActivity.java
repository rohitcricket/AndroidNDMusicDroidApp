package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Pop90sActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop90s);

        ArrayList<String> pop90s = new ArrayList<String>();

        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");
        pop90s.add("The 90s");




        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pop90s);

        ListView listView = (ListView) findViewById(R.id.pop90s);
        listView.setAdapter(itemsAdapter);
    }
}
