package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.PlayerOptions;

final class AutoValue_PlayerOptions extends PlayerOptions {
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerOptions.Builder {
        private Boolean repeatingContext;
        private Boolean repeatingTrack;
        private Boolean shufflingContext;

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions build() {
            String str = this.shufflingContext == null ? " shufflingContext" : "";
            if (this.repeatingContext == null) {
                str = je.x0(str, " repeatingContext");
            }
            if (this.repeatingTrack == null) {
                str = je.x0(str, " repeatingTrack");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerOptions(this.shufflingContext.booleanValue(), this.repeatingContext.booleanValue(), this.repeatingTrack.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingContext(boolean z) {
            this.repeatingContext = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder shufflingContext(boolean z) {
            this.shufflingContext = Boolean.valueOf(z);
            return this;
        }

        Builder() {
        }

        private Builder(PlayerOptions playerOptions) {
            this.shufflingContext = Boolean.valueOf(playerOptions.shufflingContext());
            this.repeatingContext = Boolean.valueOf(playerOptions.repeatingContext());
            this.repeatingTrack = Boolean.valueOf(playerOptions.repeatingTrack());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOptions)) {
            return false;
        }
        PlayerOptions playerOptions = (PlayerOptions) obj;
        if (this.shufflingContext == playerOptions.shufflingContext() && this.repeatingContext == playerOptions.repeatingContext() && this.repeatingTrack == playerOptions.repeatingTrack()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.shufflingContext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.repeatingContext ? 1231 : 1237)) * 1000003;
        if (!this.repeatingTrack) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @Override // com.spotify.player.model.PlayerOptions
    @JsonProperty("repeating_context")
    public boolean repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    @JsonProperty("repeating_track")
    public boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.PlayerOptions
    @JsonProperty("shuffling_context")
    public boolean shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public PlayerOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerOptions{shufflingContext=");
        V0.append(this.shufflingContext);
        V0.append(", repeatingContext=");
        V0.append(this.repeatingContext);
        V0.append(", repeatingTrack=");
        return je.P0(V0, this.repeatingTrack, "}");
    }

    private AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
    }
}
