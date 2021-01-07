package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineState implements JacksonModel {
    @JsonCreator
    public static OfflineState create(@JsonProperty("album") Album album, @JsonProperty("items") List<Track> list) {
        return new AutoValue_OfflineState(album, list);
    }

    public abstract Album getAlbum();

    public abstract List<Track> getTracks();
}
