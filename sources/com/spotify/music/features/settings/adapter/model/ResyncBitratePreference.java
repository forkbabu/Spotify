package com.spotify.music.features.settings.adapter.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ResyncBitratePreference implements JacksonModel {
    @JsonCreator
    public static ResyncBitratePreference create(@JsonProperty("audio.resync_bitrate_v2") boolean z) {
        return new AutoValue_ResyncBitratePreference(z);
    }

    @JsonProperty("audio.resync_bitrate_v2")
    public abstract boolean getResyncBitrateV2();
}
