package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.AutoValue_PlaySessionCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlaySessionCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlaySessionCommand.builder();
        }

        public abstract PlaySessionCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("play_options")
        public abstract Builder playOptions(PlayOptions playOptions);
    }

    public static Builder builder() {
        return new AutoValue_PlaySessionCommand.Builder();
    }

    public static PlaySessionCommand create() {
        return builder().build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("play_options")
    public abstract Optional<PlayOptions> playOptions();

    public abstract Builder toBuilder();
}
