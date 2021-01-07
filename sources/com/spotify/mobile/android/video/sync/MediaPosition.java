package com.spotify.mobile.android.video.sync;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.ContextTrack;

public class MediaPosition implements JacksonModel {
    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    double mPlaybackSpeed;
    @JsonProperty("position")
    long mPosition;
    @JsonProperty("timestamp")
    long mTimestamp;

    public double getPlaybackSpeed() {
        return this.mPlaybackSpeed;
    }

    public long getPosition() {
        return this.mPosition;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }
}
