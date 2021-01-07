package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Display implements JacksonModel, Parcelable {

    public static final class a extends zod<Display> {
        public a() {
            super(Display.getCreator());
        }
    }

    @JsonCreator
    public static Display create(@JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("media") String str) {
        return new AutoValue_Display(i, i2, str);
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Display> getCreator() {
        return AutoValue_Display.CREATOR;
    }

    @JsonProperty("media")
    public abstract String displayMedia();

    @JsonProperty("height")
    public abstract int getHeight();

    public String getMedia() {
        return displayMedia() == null ? "" : displayMedia();
    }

    @JsonProperty("width")
    public abstract int getWidth();
}
