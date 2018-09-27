package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that displays All Songs
        TextView allSongs = findViewById(R.id.allSongs);

        // Set a click listener on the View
        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongs.class);
                startActivity(allSongsIntent);
            }
        });


        // Find the View that displays Album List
        TextView albums = findViewById(R.id.albums);

        // Set a click listener on the View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });


        // Find the View that displays Payments
        TextView payments = findViewById(R.id.payments);

        // Set a click listener on the View
        payments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Payments View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentsIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentsIntent);
            }
        });


        // Find the View that displays Search Music Activity
        TextView search = findViewById(R.id.search_music);

        // Set a click listener on the View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search Music View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchMusicActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
