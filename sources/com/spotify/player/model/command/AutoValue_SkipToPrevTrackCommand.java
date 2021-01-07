package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

final class AutoValue_SkipToPrevTrackCommand extends SkipToPrevTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<SkipToPrevTrackOptions> options;
    private final Optional<ContextTrack> track;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SkipToPrevTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<SkipToPrevTrackOptions> options;
        private Optional<ContextTrack> track;

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand build() {
            return new AutoValue_SkipToPrevTrackCommand(this.track, this.options, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.options = Optional.of(skipToPrevTrackOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.of(contextTrack);
            return this;
        }

        Builder() {
            this.track = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            this.track = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.track = skipToPrevTrackCommand.track();
            this.options = skipToPrevTrackCommand.options();
            this.loggingParams = skipToPrevTrackCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkipToPrevTrackCommand)) {
            return false;
        }
        SkipToPrevTrackCommand skipToPrevTrackCommand = (SkipToPrevTrackCommand) obj;
        if (!this.track.equals(skipToPrevTrackCommand.track()) || !this.options.equals(skipToPrevTrackCommand.options()) || !this.loggingParams.equals(skipToPrevTrackCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    @JsonProperty("options")
    public Optional<SkipToPrevTrackOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public SkipToPrevTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SkipToPrevTrackCommand{track=");
        V0.append(this.track);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public Optional<ContextTrack> track() {
        return this.track;
    }

    private AutoValue_SkipToPrevTrackCommand(Optional<ContextTrack> optional, Optional<SkipToPrevTrackOptions> optional2, Optional<LoggingParams> optional3) {
        this.track = optional;
        this.options = optional2;
        this.loggingParams = optional3;
    }
}
