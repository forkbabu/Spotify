package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.AutoValue_PlayerOptionOverrides;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerOptionOverrides {
    public static final PlayerOptionOverrides EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerOptionOverrides.builder();
        }

        public abstract PlayerOptionOverrides build();

        @JsonProperty("repeating_context")
        public abstract Builder repeatingContext(Boolean bool);

        @JsonProperty("repeating_track")
        public abstract Builder repeatingTrack(Boolean bool);

        @JsonProperty("shuffling_context")
        public abstract Builder shufflingContext(Boolean bool);
    }

    public static Builder builder() {
        return new AutoValue_PlayerOptionOverrides.Builder();
    }

    @JsonProperty("repeating_context")
    public abstract Optional<Boolean> repeatingContext();

    @JsonProperty("repeating_track")
    public abstract Optional<Boolean> repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract Optional<Boolean> shufflingContext();

    public abstract Builder toBuilder();
}
