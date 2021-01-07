package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.AddToQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_AddToQueueCommand extends AddToQueueCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final ContextTrack track;

    static final class Builder extends AddToQueueCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private ContextTrack track;

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand build() {
            String str = this.track == null ? " track" : "";
            if (str.isEmpty()) {
                return new AutoValue_AddToQueueCommand(this.track, this.options, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(AddToQueueCommand addToQueueCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.track = addToQueueCommand.track();
            this.options = addToQueueCommand.options();
            this.loggingParams = addToQueueCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddToQueueCommand)) {
            return false;
        }
        AddToQueueCommand addToQueueCommand = (AddToQueueCommand) obj;
        if (!this.track.equals(addToQueueCommand.track()) || !this.options.equals(addToQueueCommand.options()) || !this.loggingParams.equals(addToQueueCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public AddToQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AddToQueueCommand{track=");
        V0.append(this.track);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public ContextTrack track() {
        return this.track;
    }

    private AutoValue_AddToQueueCommand(ContextTrack contextTrack, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.track = contextTrack;
        this.options = optional;
        this.loggingParams = optional2;
    }
}
