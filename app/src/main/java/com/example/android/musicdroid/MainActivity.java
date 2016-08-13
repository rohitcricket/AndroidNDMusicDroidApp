package com.example.android.musicdroid;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView favorites = (ImageView)findViewById(R.id.favorites);
        ImageView classical = (ImageView)findViewById(R.id.classical);
        ImageView popular = (ImageView)findViewById(R.id.popular);
        ImageView pop90s = (ImageView)findViewById(R.id.pop90s);
        ImageView pop80s = (ImageView)findViewById(R.id.pop80s);
        ImageView rock = (ImageView)findViewById(R.id.rock);
        ImageView jazz = (ImageView)findViewById(R.id.jazz);


        favorites.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);

            }
        });

        classical.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                    Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                    startActivity(classicalIntent);

            }
        });

        popular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent popularIntent = new Intent(MainActivity.this, PopularActivity.class);
                startActivity(popularIntent);

            }
        });

        pop90s.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent pop90sIntent = new Intent(MainActivity.this, Pop90sActivity.class);
                startActivity(pop90sIntent);

            }
        });

        pop80s.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent pop80sIntent = new Intent(MainActivity.this, Pop80sActivity.class);
                startActivity(pop80sIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);

            }
        });

        jazz.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);

            }
        });


    }


}
