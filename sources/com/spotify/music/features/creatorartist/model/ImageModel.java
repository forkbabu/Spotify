package com.spotify.music.features.creatorartist.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ImageModel implements Parcelable, JacksonModel {
    public static Image convertToImage(ImageModel imageModel) {
        return new Image(imageModel.getUri(), imageModel.getWidth(), imageModel.getHeight());
    }

    @JsonCreator
    public static ImageModel create(@JsonProperty("uri") String str, @JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("moderationUri") String str2) {
        return new AutoValue_ImageModel(str, i, i2, str2);
    }

    @JsonProperty("height")
    public abstract int getHeight();

    @JsonProperty("moderationUri")
    public abstract String getModerationUri();

    @JsonProperty("uri")
    public abstract String getUri();

    @JsonProperty("width")
    public abstract int getWidth();
}
