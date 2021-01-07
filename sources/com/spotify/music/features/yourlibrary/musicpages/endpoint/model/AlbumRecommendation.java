package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlbumRecommendation implements JacksonModel {
    @JsonCreator
    public static AlbumRecommendation create(@JsonProperty("uri") String str) {
        return new AutoValue_AlbumRecommendation(str);
    }

    public abstract String getUri();
}
