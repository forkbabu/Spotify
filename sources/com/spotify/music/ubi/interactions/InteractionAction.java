package com.spotify.music.ubi.interactions;

public enum InteractionAction {
    LIKE("like"),
    UNLIKE("unlike"),
    FOLLOW("follow"),
    UNFOLLOW("unfollow"),
    TOGGLE("toggle");
    
    private final String mLogString;

    private InteractionAction(String str) {
        this.mLogString = str;
    }

    public String d() {
        return this.mLogString;
    }
}
