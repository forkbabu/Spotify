package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerOptions extends PlayerOptions {
    private final int repeat;
    private final boolean shuffle;

    AutoValue_PlayerOptions(boolean z, int i) {
        this.shuffle = z;
        this.repeat = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOptions)) {
            return false;
        }
        PlayerOptions playerOptions = (PlayerOptions) obj;
        if (this.shuffle == playerOptions.shuffle() && this.repeat == playerOptions.repeat()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.shuffle ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.repeat;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerOptions
    @JsonProperty("repeat")
    public int repeat() {
        return this.repeat;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerOptions
    @JsonProperty("shuffle")
    public boolean shuffle() {
        return this.shuffle;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerOptions{shuffle=");
        V0.append(this.shuffle);
        V0.append(", repeat=");
        return je.B0(V0, this.repeat, "}");
    }
}
