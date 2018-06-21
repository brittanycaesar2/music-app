package com.example.android.music;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        // Find the View that show the green day album
        TextView play_button1 = (TextView) findViewById(R.id.play_button1);

        //Find the view that shows the heathens album
        TextView play_button2 = (TextView) findViewById(R.id.play_button2);

        //Find the button that shows Heart shaped Box album
        TextView play_button3 = (TextView) findViewById(R.id.play_button3);

        //Find the button that shows Jammin album
        TextView play_button4 = (TextView) findViewById(R.id.play_button4);


        //Create an arrayList for song names and artists
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Dookie");
        songs.add("Heathens");
        songs.add("HeartShaped Box");
        songs.add("Jammin");


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);


        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(itemsAdapter);


        // Set a click listener on that View
        play_button1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button1  is clicked on.
            @Override
            public void onClick(View view) {
                Intent play_button1Intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(play_button1Intent);


            }
        });


        //set a click listener on that view
        play_button2.setOnClickListener(new View.OnClickListener() {
            // the code in this method will be executed when the play button 2 is clicked on.

            @Override
            public void onClick(View v) {
                Intent play_button2Intent = new Intent(MainActivity.this, NowPlaying1.class);
                startActivity(play_button2Intent);


            }
        });


        //Set a click listener on that view
        play_button3.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the play button 3 is clicked on.

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, NowPlaying2.class);
                startActivity(colorsIntent);

            }


        });


        //Set a click listener on that view
        play_button4.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the play button 4 view is clicked on.

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, NowPlaying3.class);
                startActivity(colorsIntent);

            }


        });


    }
}



