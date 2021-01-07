package com.spotify.music.artist.model;

public enum ReleaseType {
    LATEST("latest"),
    ALBUMS("albums"),
    SINGLES("singles"),
    APPEARS_ON("appears_on"),
    APPEARS_ON_NEW("appears-on"),
    COMPILATIONS("compilations");
    
    private final String mReleaseType;

    static {
        values();
    }

    private ReleaseType(String str) {
        this.mReleaseType = str;
    }
}
