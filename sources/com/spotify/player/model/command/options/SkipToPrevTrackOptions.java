package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.AutoValue_SkipToPrevTrackOptions;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToPrevTrackOptions {
    public static final SkipToPrevTrackOptions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SkipToPrevTrackOptions.builder();
        }

        @JsonProperty("allow_seeking")
        public abstract Builder allowSeeking(Boolean bool);

        public abstract SkipToPrevTrackOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);
    }

    public static Builder builder() {
        return new AutoValue_SkipToPrevTrackOptions.Builder().commandOptions(CommandOptions.EMPTY);
    }

    @JsonProperty("allow_seeking")
    public abstract Optional<Boolean> allowSeeking();

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    public abstract Builder toBuilder();
}
