package com.spotify.music.features.ads.model;

public enum VideoType {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape"),
    UNKNOWN("unknown");
    
    private static final VideoType[] f = values();
    private final String mValue;

    private VideoType(String str) {
        this.mValue = str;
    }

    static VideoType d(String str) {
        VideoType[] videoTypeArr = f;
        for (VideoType videoType : videoTypeArr) {
            if (videoType.mValue.equalsIgnoreCase(str)) {
                return videoType;
            }
        }
        return UNKNOWN;
    }
}
