package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SkipToNextTrackCommand extends SkipToNextTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final Optional<ContextTrack> track;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SkipToNextTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Optional<ContextTrack> track;

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand build() {
            return new AutoValue_SkipToNextTrackCommand(this.track, this.options, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.of(contextTrack);
            return this;
        }

        Builder() {
            this.track = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SkipToNextTrackCommand skipToNextTrackCommand) {
            this.track = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.track = skipToNextTrackCommand.track();
            this.options = skipToNextTrackCommand.options();
            this.loggingParams = skipToNextTrackCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkipToNextTrackCommand)) {
            return false;
        }
        SkipToNextTrackCommand skipToNextTrackCommand = (SkipToNextTrackCommand) obj;
        if (!this.track.equals(skipToNextTrackCommand.track()) || !this.options.equals(skipToNextTrackCommand.options()) || !this.loggingParams.equals(skipToNextTrackCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public SkipToNextTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SkipToNextTrackCommand{track=");
        V0.append(this.track);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public Optional<ContextTrack> track() {
        return this.track;
    }

    private AutoValue_SkipToNextTrackCommand(Optional<ContextTrack> optional, Optional<CommandOptions> optional2, Optional<LoggingParams> optional3) {
        this.track = optional;
        this.options = optional2;
        this.loggingParams = optional3;
    }
}
