package com.spotify.music.yourlibrary.interfaces;

public enum YourLibraryPageGroup {
    MUSIC("music"),
    PODCAST("podcast");
    
    private final String mId;

    private YourLibraryPageGroup(String str) {
        this.mId = str;
    }
}
