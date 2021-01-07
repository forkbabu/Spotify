package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecentlyPlayedTracksResponse implements JacksonModel {
    @JsonCreator
    public static RecentlyPlayedTracksResponse create(@JsonProperty("tracks") List<ResponseTrack> list) {
        return new AutoValue_RecentlyPlayedTracksResponse(list);
    }

    public abstract List<ResponseTrack> getTracks();
}
