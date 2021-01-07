package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

public abstract class RecsRequest implements JacksonModel {
    public static RecsRequest create(int i, Set<String> set, Set<String> set2, String str) {
        return new AutoValue_RecsRequest("", i, set, set2, str, true);
    }

    @JsonCreator
    public static RecsRequest parse(String str, int i, Set<String> set, Set<String> set2, String str2, boolean z) {
        return new AutoValue_RecsRequest(str, i, set, set2, str2, z);
    }

    @JsonProperty("condensed")
    public abstract boolean condensed();

    @JsonProperty("numResults")
    public abstract int numResults();

    @JsonProperty("trackSkipIDs")
    public abstract Set<String> skipIds();

    @JsonProperty("title")
    public abstract String title();

    @JsonProperty("trackIDs")
    public abstract Set<String> trackIds();

    @JsonProperty("playlistURI")
    public abstract String uri();
}
