package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.CommandOptions;

final class AutoValue_CommandOptions extends CommandOptions {
    private final Optional<Boolean> onlyForLocalDevice;
    private final Optional<Boolean> overrideRestrictions;
    private final Optional<Boolean> systemInitiated;

    /* access modifiers changed from: package-private */
    public static final class Builder extends CommandOptions.Builder {
        private Optional<Boolean> onlyForLocalDevice;
        private Optional<Boolean> overrideRestrictions;
        private Optional<Boolean> systemInitiated;

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions build() {
            return new AutoValue_CommandOptions(this.overrideRestrictions, this.onlyForLocalDevice, this.systemInitiated);
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder onlyForLocalDevice(boolean z) {
            this.onlyForLocalDevice = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder overrideRestrictions(boolean z) {
            this.overrideRestrictions = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Optional.of(Boolean.valueOf(z));
            return this;
        }

        Builder() {
            this.overrideRestrictions = Optional.absent();
            this.onlyForLocalDevice = Optional.absent();
            this.systemInitiated = Optional.absent();
        }

        private Builder(CommandOptions commandOptions) {
            this.overrideRestrictions = Optional.absent();
            this.onlyForLocalDevice = Optional.absent();
            this.systemInitiated = Optional.absent();
            this.overrideRestrictions = commandOptions.overrideRestrictions();
            this.onlyForLocalDevice = commandOptions.onlyForLocalDevice();
            this.systemInitiated = commandOptions.systemInitiated();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommandOptions)) {
            return false;
        }
        CommandOptions commandOptions = (CommandOptions) obj;
        if (!this.overrideRestrictions.equals(commandOptions.overrideRestrictions()) || !this.onlyForLocalDevice.equals(commandOptions.onlyForLocalDevice()) || !this.systemInitiated.equals(commandOptions.systemInitiated())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.overrideRestrictions.hashCode() ^ 1000003) * 1000003) ^ this.onlyForLocalDevice.hashCode()) * 1000003) ^ this.systemInitiated.hashCode();
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    @JsonProperty("only_for_local_device")
    public Optional<Boolean> onlyForLocalDevice() {
        return this.onlyForLocalDevice;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    @JsonProperty("override_restrictions")
    public Optional<Boolean> overrideRestrictions() {
        return this.overrideRestrictions;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    @JsonProperty("system_initiated")
    public Optional<Boolean> systemInitiated() {
        return this.systemInitiated;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public CommandOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CommandOptions{overrideRestrictions=");
        V0.append(this.overrideRestrictions);
        V0.append(", onlyForLocalDevice=");
        V0.append(this.onlyForLocalDevice);
        V0.append(", systemInitiated=");
        return je.F0(V0, this.systemInitiated, "}");
    }

    private AutoValue_CommandOptions(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3) {
        this.overrideRestrictions = optional;
        this.onlyForLocalDevice = optional2;
        this.systemInitiated = optional3;
    }
}
