package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);


        ArrayList<String> popular = new ArrayList<String>();

        popular.add("Taylor Swift 1989");
        popular.add("Taylor Swift Blank Spacc");
        popular.add("Taylor Swift You Belong With Me");
        popular.add("Taylor Swift Shake it Off");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");
        popular.add("popular");







        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, popular);

        ListView listView = (ListView) findViewById(R.id.popular);
        listView.setAdapter(itemsAdapter);
    }


}
