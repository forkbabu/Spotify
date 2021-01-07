package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TracksOfflineState implements JacksonModel {
    @JsonCreator
    public static TracksOfflineState create(@JsonProperty("resources") List<OfflineTrack> list) {
        return new AutoValue_TracksOfflineState(list);
    }

    public abstract List<OfflineTrack> getTracks();
}
