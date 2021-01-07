package com.spotify.music.playlist.extender.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtenderResponse implements JacksonModel {
    public List<RecTrack> recommendedTracks;

    @JsonCreator
    public ExtenderResponse(@JsonProperty("recommendedTracks") List<RecTrack> list) {
        this.recommendedTracks = list;
    }
}
