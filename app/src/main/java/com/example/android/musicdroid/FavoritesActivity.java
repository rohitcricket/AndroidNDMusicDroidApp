package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        ArrayList<String> favorites = new ArrayList<String>();

        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");
        favorites.add("favorites");



        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favorites);

        ListView listView = (ListView) findViewById(R.id.favorites);
        listView.setAdapter(itemsAdapter);
    }
}
