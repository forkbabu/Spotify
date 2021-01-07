package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_PauseCommand extends PauseCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PauseCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand build() {
            return new AutoValue_PauseCommand(this.options, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(PauseCommand pauseCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.options = pauseCommand.options();
            this.loggingParams = pauseCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PauseCommand)) {
            return false;
        }
        PauseCommand pauseCommand = (PauseCommand) obj;
        if (!this.options.equals(pauseCommand.options()) || !this.loggingParams.equals(pauseCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PauseCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public PauseCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PauseCommand{options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_PauseCommand(Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.options = optional;
        this.loggingParams = optional2;
    }
}
