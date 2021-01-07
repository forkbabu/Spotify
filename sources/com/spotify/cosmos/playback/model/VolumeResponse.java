package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.cosmos.playback.model.AutoValue_VolumeResponse;

@JsonDeserialize(builder = AutoValue_VolumeResponse.Builder.class)
public abstract class VolumeResponse {

    public interface Builder {
        VolumeResponse build();

        @JsonProperty("system_initiated")
        Builder systemInitiated(boolean z);

        @JsonProperty("volume")
        Builder volume(Double d);
    }

    static Builder builder() {
        return new AutoValue_VolumeResponse.Builder();
    }

    @JsonProperty("system_initiated")
    public abstract boolean systemInitiated();

    @JsonProperty("volume")
    public abstract Double volume();
}
