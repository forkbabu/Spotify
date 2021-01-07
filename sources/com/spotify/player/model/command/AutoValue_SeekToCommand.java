package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SeekToCommand extends SeekToCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final long value;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SeekToCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Long value;

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand build() {
            String str = this.value == null ? " value" : "";
            if (str.isEmpty()) {
                return new AutoValue_SeekToCommand(this.value.longValue(), this.options, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder value(long j) {
            this.value = Long.valueOf(j);
            return this;
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SeekToCommand seekToCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.value = Long.valueOf(seekToCommand.value());
            this.options = seekToCommand.options();
            this.loggingParams = seekToCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeekToCommand)) {
            return false;
        }
        SeekToCommand seekToCommand = (SeekToCommand) obj;
        if (this.value != seekToCommand.value() || !this.options.equals(seekToCommand.options()) || !this.loggingParams.equals(seekToCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.value;
        return this.loggingParams.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public SeekToCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SeekToCommand{value=");
        V0.append(this.value);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    @JsonProperty("value")
    public long value() {
        return this.value;
    }

    private AutoValue_SeekToCommand(long j, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.value = j;
        this.options = optional;
        this.loggingParams = optional2;
    }
}
