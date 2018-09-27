package com.example.android.musicstructureapp;

public class Music {

    /**
     * Default word for Artist
     */
    private String mArtist;
    /**
     * Default word for the song
     */
    private String mSong;

    /**
     * Create a new Music object.
     *
     * @param Artist represent the name of singer
     * @param Song represent the title of song
     */
    public Music(String Artist, String Song) {
        mArtist = Artist;
        mSong = Song;
    }


    /**
     * Get the word for Artist.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the word for Song.
     */
    public String getSong() {
        return mSong;
    }
}