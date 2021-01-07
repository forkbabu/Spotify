package com.spotify.music.features.imagerecs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackRecsEntity implements JacksonModel {
    private final String[] mTrackUris;

    public TrackRecsEntity(@JsonProperty("trackUris") String[] strArr) {
        this.mTrackUris = strArr;
    }

    public List<String> getTrackList() {
        return Arrays.asList(this.mTrackUris);
    }
}
