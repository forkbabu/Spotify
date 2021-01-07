package com.spotify.music.playlist.extender.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Set;

public class ExtenderRequest implements JacksonModel {
    @JsonProperty("numResults")
    public int numResults;
    @JsonProperty("trackSkipIDs")
    public Set<String> skipIds;
    @JsonProperty("title")
    public String title;
    @JsonProperty("trackIDs")
    public List<String> trackIds;
    @JsonProperty("playlistURI")
    public String uri;

    public ExtenderRequest(String str, int i, Set<String> set, List<String> list, String str2) {
        this.uri = str;
        this.numResults = i;
        this.skipIds = set;
        this.trackIds = list;
        this.title = str2;
    }
}
