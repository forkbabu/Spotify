package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Image implements JacksonModel, Parcelable {

    public static final class a extends zod<Image> {
        public a() {
            super(AutoValue_Image.CREATOR);
        }
    }

    @JsonCreator
    public static Image create(@JsonProperty("url") String str) {
        return new AutoValue_Image(str);
    }

    @JsonProperty("url")
    public abstract String getUrl();
}
