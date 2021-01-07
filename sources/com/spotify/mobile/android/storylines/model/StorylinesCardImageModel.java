package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StorylinesCardImageModel implements JacksonModel {
    @JsonCreator
    public static StorylinesCardImageModel create(@JsonProperty("uri") String str, @JsonProperty("imageId") String str2, @JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("type") String str3) {
        return new AutoValue_StorylinesCardImageModel(str, str2, i, i2, str3);
    }

    @JsonProperty("height")
    public abstract int getHeight();

    @JsonProperty("imageId")
    public abstract String getImageId();

    @JsonProperty("type")
    public abstract String getType();

    @JsonProperty("uri")
    public abstract String getUri();

    @JsonProperty("width")
    public abstract int getWidth();
}
