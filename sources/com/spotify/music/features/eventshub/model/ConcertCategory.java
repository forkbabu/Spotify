package com.spotify.music.features.eventshub.model;

public enum ConcertCategory {
    VIRTUAL("ONLINE"),
    CONCERT("CONCERT");
    
    public static final ConcertCategory[] c = values();
    private final String mCategoryName;

    private ConcertCategory(String str) {
        this.mCategoryName = str;
    }

    public String d() {
        return this.mCategoryName;
    }
}
