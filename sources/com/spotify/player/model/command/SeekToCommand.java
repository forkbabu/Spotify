package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.AutoValue_SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SeekToCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SeekToCommand.builder(0);
        }

        public abstract SeekToCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty("value")
        @JsonAlias({"position"})
        public abstract Builder value(long j);
    }

    public static Builder builder(long j) {
        return new AutoValue_SeekToCommand.Builder().value(j);
    }

    public static SeekToCommand create(long j) {
        return builder(j).build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("options")
    public abstract Optional<CommandOptions> options();

    public abstract Builder toBuilder();

    @JsonProperty("value")
    public abstract long value();
}
