package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class a {
    @JsonCreator
    public static a create(@JsonProperty("uri") String str) {
        return new c(str);
    }

    public abstract String a();
}
