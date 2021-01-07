package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.AutoValue_SetOptionsCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SetOptionsCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SetOptionsCommand.builder();
        }

        public abstract SetOptionsCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty("repeating_context")
        public abstract Builder repeatingContext(boolean z);

        @JsonProperty("repeating_track")
        public abstract Builder repeatingTrack(boolean z);

        @JsonProperty("shuffling_context")
        public abstract Builder shufflingContext(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_SetOptionsCommand.Builder();
    }

    public static SetOptionsCommand create() {
        return builder().build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("options")
    public abstract Optional<CommandOptions> options();

    @JsonProperty("repeating_context")
    public abstract Optional<Boolean> repeatingContext();

    @JsonProperty("repeating_track")
    public abstract Optional<Boolean> repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract Optional<Boolean> shufflingContext();

    public abstract Builder toBuilder();
}
