package com.spotify.music.features.ads.audioplus;

public enum LeaveBehindAdType {
    BRAND_ADS("brand_ads"),
    MUSIC_PROMO("content_promo"),
    PODCAST_PROMO("podcast_promo"),
    CONCERT_PROMO("concert_promo");
    
    private final String mName;

    private LeaveBehindAdType(String str) {
        this.mName = str;
    }

    public String d() {
        return this.mName;
    }
}
