package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.AutoValue_PlayOptions;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayOptions {
    public static final PlayOptions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayOptions.builder();
        }

        public abstract PlayOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);

        @JsonProperty("operation")
        public abstract Builder operation(PlayOperation playOperation);

        @JsonProperty("trigger")
        public abstract Builder trigger(PlayTrigger playTrigger);
    }

    public static Builder builder() {
        return new AutoValue_PlayOptions.Builder().commandOptions(CommandOptions.EMPTY);
    }

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    @JsonProperty("operation")
    public abstract Optional<PlayOperation> operation();

    public abstract Builder toBuilder();

    @JsonProperty("trigger")
    public abstract Optional<PlayTrigger> trigger();
}
