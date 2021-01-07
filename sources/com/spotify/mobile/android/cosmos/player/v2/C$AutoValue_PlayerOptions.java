package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.$AutoValue_PlayerOptions  reason: invalid class name */
abstract class C$AutoValue_PlayerOptions extends PlayerOptions {
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    C$AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptions
    @JsonProperty("repeating_context")
    public boolean repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptions
    @JsonProperty("repeating_track")
    public boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptions
    @JsonProperty("shuffling_context")
    public boolean shufflingContext() {
        return this.shufflingContext;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PlayerOptions{shufflingContext=");
        V0.append(this.shufflingContext);
        V0.append(", repeatingContext=");
        V0.append(this.repeatingContext);
        V0.append(", repeatingTrack=");
        return je.P0(V0, this.repeatingTrack, "}");
    }
}
