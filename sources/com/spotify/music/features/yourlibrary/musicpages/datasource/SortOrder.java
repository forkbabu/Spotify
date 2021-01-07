package com.spotify.music.features.yourlibrary.musicpages.datasource;

public enum SortOrder {
    NAME("name"),
    ARTIST_NAME("artist_name"),
    ALBUM_NAME("album_name"),
    RELEVANCE("relevance"),
    RECENTLY_PLAYED("recently_played"),
    RECENTLY_ADDED("recently_added"),
    ADD_TIME("add_time"),
    CUSTOM("custom");
    
    private final String mId;

    static {
        values();
    }

    private SortOrder(String str) {
        this.mId = str;
    }
}
