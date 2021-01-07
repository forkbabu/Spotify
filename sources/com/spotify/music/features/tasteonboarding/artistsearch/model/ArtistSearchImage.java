package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ArtistSearchImage implements JacksonModel, Parcelable {
    @JsonCreator
    public static ArtistSearchImage create(@JsonProperty("uri") String str, @JsonProperty("height") int i, @JsonProperty("width") int i2) {
        return new AutoValue_ArtistSearchImage(str, i, i2);
    }

    public abstract int height();

    public abstract String uri();

    public abstract int width();
}
