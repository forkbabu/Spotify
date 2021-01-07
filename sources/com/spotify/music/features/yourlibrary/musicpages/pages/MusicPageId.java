package com.spotify.music.features.yourlibrary.musicpages.pages;

public enum MusicPageId {
    PLAYLISTS("playlists"),
    ARTISTS("artists"),
    ALBUMS("albums"),
    FOLDER("folder"),
    SONGS("songs");
    
    private final String mId;

    static {
        values();
    }

    private MusicPageId(String str) {
        this.mId = str;
    }

    public String d() {
        return this.mId;
    }
}
