package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.cosmos.playback.model.AutoValue_SetVolumeRequest;

@JsonDeserialize(builder = AutoValue_SetVolumeRequest.Builder.class)
public abstract class SetVolumeRequest {

    public interface Builder {
        SetVolumeRequest build();

        @JsonProperty("step")
        Builder step(Step step);

        @JsonProperty("volume")
        Builder volume(Double d);
    }

    enum Step {
        UP,
        DOWN
    }

    static Builder builder() {
        return new AutoValue_SetVolumeRequest.Builder();
    }

    public static SetVolumeRequest down() {
        return builder().step(Step.DOWN).build();
    }

    public static SetVolumeRequest up() {
        return builder().step(Step.UP).build();
    }

    public static SetVolumeRequest withVolume(double d) {
        return builder().volume(Double.valueOf(d)).build();
    }

    @JsonProperty("step")
    public abstract Step step();

    @JsonProperty("volume")
    public abstract Double volume();
}
