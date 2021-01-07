package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class AlbumArtist implements JacksonModel {
    @JsonCreator
    public static AlbumArtist create(@JsonProperty("name") String str, @JsonProperty("uri") String str2) {
        return new AutoValue_AlbumArtist(str, str2);
    }

    @JsonGetter("name")
    public abstract String getName();

    @JsonGetter("uri")
    public abstract String getUri();
}
