package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.cosmos.playback.model.AutoValue_PositionResponse;

@JsonDeserialize(builder = AutoValue_PositionResponse.Builder.class)
public abstract class PositionResponse {

    public interface Builder {
        PositionResponse build();

        @JsonProperty("position")
        Builder position(Long l);
    }

    public static Builder builder() {
        return new AutoValue_PositionResponse.Builder();
    }

    @JsonProperty("position")
    public abstract Long position();
}
