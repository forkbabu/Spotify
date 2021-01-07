package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.PlaySessionCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;

final class AutoValue_PlaySessionCommand extends PlaySessionCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<PlayOptions> playOptions;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlaySessionCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<PlayOptions> playOptions;

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand build() {
            return new AutoValue_PlaySessionCommand(this.playOptions, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder playOptions(PlayOptions playOptions2) {
            this.playOptions = Optional.of(playOptions2);
            return this;
        }

        Builder() {
            this.playOptions = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(PlaySessionCommand playSessionCommand) {
            this.playOptions = Optional.absent();
            this.loggingParams = Optional.absent();
            this.playOptions = playSessionCommand.playOptions();
            this.loggingParams = playSessionCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaySessionCommand)) {
            return false;
        }
        PlaySessionCommand playSessionCommand = (PlaySessionCommand) obj;
        if (!this.playOptions.equals(playSessionCommand.playOptions()) || !this.loggingParams.equals(playSessionCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.playOptions.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    @JsonProperty("play_options")
    public Optional<PlayOptions> playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public PlaySessionCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaySessionCommand{playOptions=");
        V0.append(this.playOptions);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_PlaySessionCommand(Optional<PlayOptions> optional, Optional<LoggingParams> optional2) {
        this.playOptions = optional;
        this.loggingParams = optional2;
    }
}
