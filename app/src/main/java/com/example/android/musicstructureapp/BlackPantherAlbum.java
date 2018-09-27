package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BlackPantherAlbum extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array of songs
        ArrayList<Music> songs = new ArrayList<>();
        songs.add(new Music("Kendrick Larmar and SZA", "All The Stars"));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //code to display toast message
                Toast.makeText(getBaseContext(),"Now Playing", Toast.LENGTH_LONG).show();

                //code specific to all list item to open the NowPlayingActivity
                Intent myIntent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
