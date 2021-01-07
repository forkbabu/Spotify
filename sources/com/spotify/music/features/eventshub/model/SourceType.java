package com.spotify.music.features.eventshub.model;

public enum SourceType {
    POPULAR("popular"),
    RECOMMENDATIONS("recommendation"),
    VIRTUAL("online"),
    ALL("all");
    
    public static final SourceType[] n = values();
    private final String mSourceName;

    private SourceType(String str) {
        this.mSourceName = str;
    }

    public String d() {
        return this.mSourceName;
    }
}
