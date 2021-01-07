package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PlayerOptionsOverrides implements JacksonModel, Parcelable {
    @JsonCreator
    public static PlayerOptionsOverrides create(@JsonProperty("shuffling_context") Boolean bool, @JsonProperty("repeating_context") Boolean bool2, @JsonProperty("repeating_track") Boolean bool3) {
        return new AutoValue_PlayerOptionsOverrides(bool, bool2, bool3);
    }

    @JsonProperty("repeating_context")
    public abstract Boolean repeatingContext();

    @JsonProperty("repeating_track")
    public abstract Boolean repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract Boolean shufflingContext();
}
