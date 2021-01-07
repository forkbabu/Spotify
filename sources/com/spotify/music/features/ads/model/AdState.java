package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdState implements JacksonModel, Parcelable {
    @JsonCreator
    public static AdState create(@JsonProperty("state") State state) {
        return new AutoValue_AdState(state);
    }

    @JsonProperty("state")
    public abstract State getState();
}
