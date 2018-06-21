package com.example.android.music;

/**
 * contains both song and artist name
 */
public class songs {

    /**
     * the artist name
     */
    private String mArtistName;

    /**
     * the song title
     */
    private String mSongTile;

    /**
     * Create a new song title and artist name object.
     *
     * @param mArtistName for the artist name
     * @param mSongTile   for the song tile
     */
    public songs(String mArtistName, String mSongTile) {
        mArtistName = mArtistName;
        mSongTile = mSongTile;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song tile
     */
    public String getSongTile() {
        return mSongTile;
    }


}

