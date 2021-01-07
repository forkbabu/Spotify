package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.SetRepeatingTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetRepeatingTrackCommand extends SetRepeatingTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final boolean value;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SetRepeatingTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Boolean value;

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand build() {
            String str = this.value == null ? " value" : "";
            if (str.isEmpty()) {
                return new AutoValue_SetRepeatingTrackCommand(this.value.booleanValue(), this.options, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder value(boolean z) {
            this.value = Boolean.valueOf(z);
            return this;
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SetRepeatingTrackCommand setRepeatingTrackCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.value = Boolean.valueOf(setRepeatingTrackCommand.value());
            this.options = setRepeatingTrackCommand.options();
            this.loggingParams = setRepeatingTrackCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetRepeatingTrackCommand)) {
            return false;
        }
        SetRepeatingTrackCommand setRepeatingTrackCommand = (SetRepeatingTrackCommand) obj;
        if (this.value != setRepeatingTrackCommand.value() || !this.options.equals(setRepeatingTrackCommand.options()) || !this.loggingParams.equals(setRepeatingTrackCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    public SetRepeatingTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetRepeatingTrackCommand{value=");
        V0.append(this.value);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    @JsonProperty("value")
    public boolean value() {
        return this.value;
    }

    private AutoValue_SetRepeatingTrackCommand(boolean z, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.value = z;
        this.options = optional;
        this.loggingParams = optional2;
    }
}
