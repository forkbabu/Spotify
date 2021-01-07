package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class f {
    @JsonCreator
    public static f create(@JsonProperty("username") String str, @JsonProperty("affinity") String str2, @JsonProperty("score") int i) {
        return new a(str, str2, i);
    }

    public abstract String a();

    public abstract int b();

    public abstract String c();
}
