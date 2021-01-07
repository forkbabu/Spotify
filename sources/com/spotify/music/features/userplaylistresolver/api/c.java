package com.spotify.music.features.userplaylistresolver.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.userplaylistresolver.api.a;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class c {

    public interface a {
    }

    @JsonCreator
    public static c create(String str) {
        a.b bVar = new a.b();
        bVar.b(str);
        return bVar.a();
    }

    @JsonProperty("intent")
    public abstract String intentUri();
}
