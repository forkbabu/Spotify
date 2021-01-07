package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendedPlaylistsResponse implements JacksonModel {
    @JsonIgnore
    private final Playlists mPlaylists;

    @JsonCreator
    public RecommendedPlaylistsResponse(@JsonProperty("playlists") Playlists playlists) {
        this.mPlaylists = playlists;
    }

    @JsonGetter("playlists")
    public Playlists getPlaylists() {
        Assertion.e(this.mPlaylists);
        return this.mPlaylists;
    }

    @JsonIgnore
    public boolean hasPlaylists() {
        Playlists playlists = this.mPlaylists;
        return (playlists == null || playlists.items() == null || this.mPlaylists.items().isEmpty()) ? false : true;
    }
}
