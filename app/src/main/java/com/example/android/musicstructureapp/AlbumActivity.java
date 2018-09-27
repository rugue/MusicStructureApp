package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);


        // Find the View that displays TheHill Album
        TextView theHill = findViewById(R.id.the_hill);

        // Set a click listener on the View
        theHill.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent theHillIntent = new Intent(AlbumActivity.this, TheHillAlbum.class);
                startActivity(theHillIntent);
            }
        });

        // Find the View that displays Hymnbook Album
        TextView hymnbook = findViewById(R.id.hymnbook);

        // Set a click listener on the View
        hymnbook.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hymnbookIntent = new Intent(AlbumActivity.this, HymnbookAlbum.class);
                startActivity(hymnbookIntent);
            }
        });


        // Find the View that displays Hymnbook Album
        TextView blackPanther = findViewById(R.id.black_panther);

        // Set a click listener on the View
        blackPanther.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent blackPantherIntent = new Intent(AlbumActivity.this, BlackPantherAlbum.class);
                startActivity(blackPantherIntent);
            }
        });


        // Find the View that displays Loose Blues Album
        TextView looseBlues = findViewById(R.id.loose_blues);

        // Set a click listener on the View
        looseBlues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent looseBluesIntent = new Intent(AlbumActivity.this, LooseBluesAlbum.class);
                startActivity(looseBluesIntent);
            }
        });
    }
}
