package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.PlayOptions;

final class AutoValue_PlayOptions extends PlayOptions {
    private final CommandOptions commandOptions;
    private final Optional<PlayOperation> operation;
    private final Optional<PlayTrigger> trigger;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayOptions.Builder {
        private CommandOptions commandOptions;
        private Optional<PlayOperation> operation;
        private Optional<PlayTrigger> trigger;

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions build() {
            String str = this.commandOptions == null ? " commandOptions" : "";
            if (str.isEmpty()) {
                return new AutoValue_PlayOptions(this.operation, this.trigger, this.commandOptions);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder operation(PlayOperation playOperation) {
            this.operation = Optional.of(playOperation);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder trigger(PlayTrigger playTrigger) {
            this.trigger = Optional.of(playTrigger);
            return this;
        }

        Builder() {
            this.operation = Optional.absent();
            this.trigger = Optional.absent();
        }

        private Builder(PlayOptions playOptions) {
            this.operation = Optional.absent();
            this.trigger = Optional.absent();
            this.operation = playOptions.operation();
            this.trigger = playOptions.trigger();
            this.commandOptions = playOptions.commandOptions();
        }
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayOptions)) {
            return false;
        }
        PlayOptions playOptions = (PlayOptions) obj;
        if (!this.operation.equals(playOptions.operation()) || !this.trigger.equals(playOptions.trigger()) || !this.commandOptions.equals(playOptions.commandOptions())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.operation.hashCode() ^ 1000003) * 1000003) ^ this.trigger.hashCode()) * 1000003) ^ this.commandOptions.hashCode();
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    @JsonProperty("operation")
    public Optional<PlayOperation> operation() {
        return this.operation;
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public PlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayOptions{operation=");
        V0.append(this.operation);
        V0.append(", trigger=");
        V0.append(this.trigger);
        V0.append(", commandOptions=");
        V0.append(this.commandOptions);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    @JsonProperty("trigger")
    public Optional<PlayTrigger> trigger() {
        return this.trigger;
    }

    private AutoValue_PlayOptions(Optional<PlayOperation> optional, Optional<PlayTrigger> optional2, CommandOptions commandOptions2) {
        this.operation = optional;
        this.trigger = optional2;
        this.commandOptions = commandOptions2;
    }
}
