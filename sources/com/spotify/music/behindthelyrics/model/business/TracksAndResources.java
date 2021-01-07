package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = TracksAndResources_Deserializer.class)
public class TracksAndResources implements JacksonModel {
    private final Set<String> mTrackUris;

    @JsonCreator
    public TracksAndResources(@JsonProperty("trackUris") String[] strArr) {
        this(ImmutableSet.copyOf(strArr));
    }

    public boolean containsTrack(String str) {
        return this.mTrackUris.contains(str);
    }

    public Set<String> getTrackUris() {
        return this.mTrackUris;
    }

    public TracksAndResources(Set<String> set) {
        this.mTrackUris = set;
    }
}
