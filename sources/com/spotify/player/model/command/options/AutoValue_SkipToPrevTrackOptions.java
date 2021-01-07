package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

final class AutoValue_SkipToPrevTrackOptions extends SkipToPrevTrackOptions {
    private final Optional<Boolean> allowSeeking;
    private final CommandOptions commandOptions;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SkipToPrevTrackOptions.Builder {
        private Optional<Boolean> allowSeeking;
        private CommandOptions commandOptions;

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder allowSeeking(Boolean bool) {
            this.allowSeeking = Optional.of(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions build() {
            String str = this.commandOptions == null ? " commandOptions" : "";
            if (str.isEmpty()) {
                return new AutoValue_SkipToPrevTrackOptions(this.allowSeeking, this.commandOptions);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        Builder() {
            this.allowSeeking = Optional.absent();
        }

        private Builder(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.allowSeeking = Optional.absent();
            this.allowSeeking = skipToPrevTrackOptions.allowSeeking();
            this.commandOptions = skipToPrevTrackOptions.commandOptions();
        }
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    @JsonProperty("allow_seeking")
    public Optional<Boolean> allowSeeking() {
        return this.allowSeeking;
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkipToPrevTrackOptions)) {
            return false;
        }
        SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) obj;
        if (!this.allowSeeking.equals(skipToPrevTrackOptions.allowSeeking()) || !this.commandOptions.equals(skipToPrevTrackOptions.commandOptions())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.allowSeeking.hashCode() ^ 1000003) * 1000003) ^ this.commandOptions.hashCode();
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    public SkipToPrevTrackOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SkipToPrevTrackOptions{allowSeeking=");
        V0.append(this.allowSeeking);
        V0.append(", commandOptions=");
        V0.append(this.commandOptions);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_SkipToPrevTrackOptions(Optional<Boolean> optional, CommandOptions commandOptions2) {
        this.allowSeeking = optional;
        this.commandOptions = commandOptions2;
    }
}
