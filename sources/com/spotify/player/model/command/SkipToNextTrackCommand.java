package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.AutoValue_SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToNextTrackCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SkipToNextTrackCommand.builder();
        }

        public abstract SkipToNextTrackCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new AutoValue_SkipToNextTrackCommand.Builder();
    }

    public static SkipToNextTrackCommand create() {
        return builder().build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("options")
    public abstract Optional<CommandOptions> options();

    public abstract Builder toBuilder();

    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public abstract Optional<ContextTrack> track();
}
