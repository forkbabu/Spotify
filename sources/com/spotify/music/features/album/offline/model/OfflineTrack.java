package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.b;

public abstract class OfflineTrack implements JacksonModel {
    @JsonCreator
    public static OfflineTrack create(@JsonProperty("offline_availability") String str, @JsonProperty("uri") String str2) {
        return new AutoValue_OfflineTrack(b.a(str, 0), str2);
    }

    public abstract a getOfflineState();

    public abstract String getUri();
}
