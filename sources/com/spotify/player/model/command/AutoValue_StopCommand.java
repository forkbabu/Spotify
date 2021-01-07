package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.StopCommand;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_StopCommand extends StopCommand {
    private final Optional<LoggingParams> loggingParams;

    /* access modifiers changed from: package-private */
    public static final class Builder extends StopCommand.Builder {
        private Optional<LoggingParams> loggingParams;

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand build() {
            return new AutoValue_StopCommand(this.loggingParams);
        }

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        Builder() {
            this.loggingParams = Optional.absent();
        }

        private Builder(StopCommand stopCommand) {
            this.loggingParams = Optional.absent();
            this.loggingParams = stopCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopCommand) {
            return this.loggingParams.equals(((StopCommand) obj).loggingParams());
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.StopCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.StopCommand
    public StopCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return je.F0(je.V0("StopCommand{loggingParams="), this.loggingParams, "}");
    }

    private AutoValue_StopCommand(Optional<LoggingParams> optional) {
        this.loggingParams = optional;
    }
}
