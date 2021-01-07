package com.spotify.share.sharedata;

public enum ShareCapability {
    LINK("link"),
    MESSAGE("message"),
    IMAGE("image"),
    GRADIENT_STORY("gradient-story"),
    IMAGE_STORY("image-story"),
    VIDEO_STORY("video-story");
    
    private final String mLogId;

    private ShareCapability(String str) {
        this.mLogId = str;
    }

    public String d() {
        return this.mLogId;
    }
}
