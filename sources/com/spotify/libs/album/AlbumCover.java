package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class AlbumCover implements JacksonModel {
    @JsonCreator
    public static AlbumCover create(@JsonProperty("uri") String str) {
        return new AutoValue_AlbumCover(str);
    }

    @JsonGetter("uri")
    public abstract String getUri();
}
