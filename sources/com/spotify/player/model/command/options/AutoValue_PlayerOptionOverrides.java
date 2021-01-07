package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.PlayerOptionOverrides;

final class AutoValue_PlayerOptionOverrides extends PlayerOptionOverrides {
    private final Optional<Boolean> repeatingContext;
    private final Optional<Boolean> repeatingTrack;
    private final Optional<Boolean> shufflingContext;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerOptionOverrides.Builder {
        private Optional<Boolean> repeatingContext;
        private Optional<Boolean> repeatingTrack;
        private Optional<Boolean> shufflingContext;

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides build() {
            return new AutoValue_PlayerOptionOverrides(this.shufflingContext, this.repeatingContext, this.repeatingTrack);
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder repeatingContext(Boolean bool) {
            this.repeatingContext = Optional.of(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder repeatingTrack(Boolean bool) {
            this.repeatingTrack = Optional.of(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder shufflingContext(Boolean bool) {
            this.shufflingContext = Optional.of(bool);
            return this;
        }

        Builder() {
            this.shufflingContext = Optional.absent();
            this.repeatingContext = Optional.absent();
            this.repeatingTrack = Optional.absent();
        }

        private Builder(PlayerOptionOverrides playerOptionOverrides) {
            this.shufflingContext = Optional.absent();
            this.repeatingContext = Optional.absent();
            this.repeatingTrack = Optional.absent();
            this.shufflingContext = playerOptionOverrides.shufflingContext();
            this.repeatingContext = playerOptionOverrides.repeatingContext();
            this.repeatingTrack = playerOptionOverrides.repeatingTrack();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOptionOverrides)) {
            return false;
        }
        PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) obj;
        if (!this.shufflingContext.equals(playerOptionOverrides.shufflingContext()) || !this.repeatingContext.equals(playerOptionOverrides.repeatingContext()) || !this.repeatingTrack.equals(playerOptionOverrides.repeatingTrack())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.shufflingContext.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.repeatingTrack.hashCode();
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    @JsonProperty("repeating_context")
    public Optional<Boolean> repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    @JsonProperty("repeating_track")
    public Optional<Boolean> repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    @JsonProperty("shuffling_context")
    public Optional<Boolean> shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public PlayerOptionOverrides.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerOptionOverrides{shufflingContext=");
        V0.append(this.shufflingContext);
        V0.append(", repeatingContext=");
        V0.append(this.repeatingContext);
        V0.append(", repeatingTrack=");
        return je.F0(V0, this.repeatingTrack, "}");
    }

    private AutoValue_PlayerOptionOverrides(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3) {
        this.shufflingContext = optional;
        this.repeatingContext = optional2;
        this.repeatingTrack = optional3;
    }
}
