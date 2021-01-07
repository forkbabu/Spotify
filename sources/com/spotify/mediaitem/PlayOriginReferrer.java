package com.spotify.mediaitem;

public enum PlayOriginReferrer {
    HOME("home"),
    RECENTLY_PLAYED("recently_played"),
    BROWSE("browse"),
    LIBRARY("library"),
    OTHER("other");
    
    private final String mIdentifier;

    private PlayOriginReferrer(String str) {
        this.mIdentifier = str;
    }

    public String d() {
        return this.mIdentifier;
    }
}
