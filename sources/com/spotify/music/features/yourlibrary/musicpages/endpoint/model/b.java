package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public abstract class b {
    @JsonCreator
    public static b create(@JsonProperty("artistRecommendations") List<a> list) {
        return new d(list);
    }

    public abstract List<a> a();
}
