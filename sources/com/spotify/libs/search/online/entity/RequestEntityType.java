package com.spotify.libs.search.online.entity;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public enum RequestEntityType {
    ALBUM("album"),
    ARTIST("artist"),
    GENRE("genre"),
    PLAYLIST("playlist"),
    USER_PROFILE("user_profile"),
    TRACK(AppProtocol.TrackData.TYPE_TRACK),
    AUDIO_SHOW("show"),
    AUDIO_EPISODE("audio_episode"),
    TOPIC("topic");
    
    private final String mType;

    private RequestEntityType(String str) {
        this.mType = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mType;
    }
}
