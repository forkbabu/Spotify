package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetShufflingContextCommand extends SetShufflingContextCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final boolean value;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SetShufflingContextCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Boolean value;

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand build() {
            String str = this.value == null ? " value" : "";
            if (str.isEmpty()) {
                return new AutoValue_SetShufflingContextCommand(this.value.booleanValue(), this.options, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder value(boolean z) {
            this.value = Boolean.valueOf(z);
            return this;
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SetShufflingContextCommand setShufflingContextCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.value = Boolean.valueOf(setShufflingContextCommand.value());
            this.options = setShufflingContextCommand.options();
            this.loggingParams = setShufflingContextCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetShufflingContextCommand)) {
            return false;
        }
        SetShufflingContextCommand setShufflingContextCommand = (SetShufflingContextCommand) obj;
        if (this.value != setShufflingContextCommand.value() || !this.options.equals(setShufflingContextCommand.options()) || !this.loggingParams.equals(setShufflingContextCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    public SetShufflingContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetShufflingContextCommand{value=");
        V0.append(this.value);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("value")
    public boolean value() {
        return this.value;
    }

    private AutoValue_SetShufflingContextCommand(boolean z, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.value = z;
        this.options = optional;
        this.loggingParams = optional2;
    }
}
