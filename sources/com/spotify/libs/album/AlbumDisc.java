package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class AlbumDisc implements JacksonModel {
    @JsonCreator
    public static AlbumDisc create(@JsonProperty("tracks") List<c> list) {
        return new AutoValue_AlbumDisc(gf0.a(list));
    }

    @JsonGetter("tracks")
    public abstract List<c> getTracks();
}
