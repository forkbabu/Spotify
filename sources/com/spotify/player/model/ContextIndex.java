package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public abstract class ContextIndex {
    public static ContextIndex create() {
        return create(0, 0);
    }

    @JsonProperty("page")
    public abstract long page();

    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public abstract long track();

    @JsonCreator
    public static ContextIndex create(@JsonProperty("page") long j, @JsonProperty("track") long j2) {
        return new AutoValue_ContextIndex(j, j2);
    }
}
