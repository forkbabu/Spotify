package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.b;

public abstract class Track implements JacksonModel {
    @JsonCreator
    public static Track create(@JsonProperty("offline") String str, @JsonProperty("syncProgress") int i, @JsonProperty("link") String str2) {
        return new AutoValue_Track(b.a(str, i), str2);
    }

    public abstract String getLink();

    public abstract a getOfflineState();
}
