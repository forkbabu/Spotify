package com.spotify.music.nowplaying.core.modes;

public enum NowPlayingMode {
    AUDIO_ADS("audio_ads_mode"),
    VIDEO_ADS("video_ads_mode"),
    DRIVING("driving_mode"),
    DEFAULT("default_mode"),
    FEEDBACK("feedback_mode"),
    FREE_TIER("free_tier_mode"),
    PODCAST("podcast_mode"),
    VIDEO_SHOW("video_show_mode");
    
    private final String mName;

    static {
        values();
    }

    private NowPlayingMode(String str) {
        this.mName = str;
    }

    public String d() {
        return this.mName;
    }
}
