package com.example.android.musicdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        ArrayList<String> rock = new ArrayList<String>();

        rock.add("rock1");
        rock.add("rock2");
        rock.add("rock3");
        rock.add("rock4");
        rock.add("rock5");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");
        rock.add("rock6");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rock);

        ListView listView = (ListView) findViewById(R.id.rock);
        listView.setAdapter(itemsAdapter);

    }
}
