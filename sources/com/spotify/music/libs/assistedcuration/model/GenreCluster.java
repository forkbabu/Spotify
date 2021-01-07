package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreCluster implements JacksonModel {
    private final String mName;
    private final List<RecsTrack> mTracks;

    @JsonCreator
    public GenreCluster(@JsonProperty("genre_name") String str, @JsonProperty("genre_tracks") List<RecsTrack> list) {
        this.mName = str;
        this.mTracks = list;
    }

    public String getName() {
        return this.mName;
    }

    public List<RecsTrack> getTracks() {
        return this.mTracks;
    }
}
