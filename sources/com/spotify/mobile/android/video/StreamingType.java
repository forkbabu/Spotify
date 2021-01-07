package com.spotify.mobile.android.video;

public enum StreamingType {
    CACHE("cache"),
    LIVE("live"),
    LOCAL("local"),
    OFFLINE("offline"),
    ON_DEMAND("on_demand"),
    UNKNOWN("unknown");
    
    private final String mValue;

    private StreamingType(String str) {
        this.mValue = str;
    }

    public String d() {
        return this.mValue;
    }
}
