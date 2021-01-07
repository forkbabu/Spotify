package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_ResumeCommand extends ResumeCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ResumeCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand build() {
            return new AutoValue_ResumeCommand(this.options, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(ResumeCommand resumeCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.options = resumeCommand.options();
            this.loggingParams = resumeCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResumeCommand)) {
            return false;
        }
        ResumeCommand resumeCommand = (ResumeCommand) obj;
        if (!this.options.equals(resumeCommand.options()) || !this.loggingParams.equals(resumeCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public ResumeCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ResumeCommand{options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_ResumeCommand(Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.options = optional;
        this.loggingParams = optional2;
    }
}
