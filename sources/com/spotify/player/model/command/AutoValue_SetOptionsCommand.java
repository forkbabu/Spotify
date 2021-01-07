package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.SetOptionsCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetOptionsCommand extends SetOptionsCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final Optional<Boolean> repeatingContext;
    private final Optional<Boolean> repeatingTrack;
    private final Optional<Boolean> shufflingContext;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SetOptionsCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Optional<Boolean> repeatingContext;
        private Optional<Boolean> repeatingTrack;
        private Optional<Boolean> shufflingContext;

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand build() {
            return new AutoValue_SetOptionsCommand(this.repeatingTrack, this.repeatingContext, this.shufflingContext, this.options, this.loggingParams);
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingContext(boolean z) {
            this.repeatingContext = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder shufflingContext(boolean z) {
            this.shufflingContext = Optional.of(Boolean.valueOf(z));
            return this;
        }

        Builder() {
            this.repeatingTrack = Optional.absent();
            this.repeatingContext = Optional.absent();
            this.shufflingContext = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SetOptionsCommand setOptionsCommand) {
            this.repeatingTrack = Optional.absent();
            this.repeatingContext = Optional.absent();
            this.shufflingContext = Optional.absent();
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.repeatingTrack = setOptionsCommand.repeatingTrack();
            this.repeatingContext = setOptionsCommand.repeatingContext();
            this.shufflingContext = setOptionsCommand.shufflingContext();
            this.options = setOptionsCommand.options();
            this.loggingParams = setOptionsCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetOptionsCommand)) {
            return false;
        }
        SetOptionsCommand setOptionsCommand = (SetOptionsCommand) obj;
        if (!this.repeatingTrack.equals(setOptionsCommand.repeatingTrack()) || !this.repeatingContext.equals(setOptionsCommand.repeatingContext()) || !this.shufflingContext.equals(setOptionsCommand.shufflingContext()) || !this.options.equals(setOptionsCommand.options()) || !this.loggingParams.equals(setOptionsCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.repeatingTrack.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.shufflingContext.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    @JsonProperty("repeating_context")
    public Optional<Boolean> repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    @JsonProperty("repeating_track")
    public Optional<Boolean> repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    @JsonProperty("shuffling_context")
    public Optional<Boolean> shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public SetOptionsCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetOptionsCommand{repeatingTrack=");
        V0.append(this.repeatingTrack);
        V0.append(", repeatingContext=");
        V0.append(this.repeatingContext);
        V0.append(", shufflingContext=");
        V0.append(this.shufflingContext);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_SetOptionsCommand(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<CommandOptions> optional4, Optional<LoggingParams> optional5) {
        this.repeatingTrack = optional;
        this.repeatingContext = optional2;
        this.shufflingContext = optional3;
        this.options = optional4;
        this.loggingParams = optional5;
    }
}
