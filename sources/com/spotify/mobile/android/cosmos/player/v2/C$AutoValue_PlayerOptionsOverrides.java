package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.$AutoValue_PlayerOptionsOverrides  reason: invalid class name */
abstract class C$AutoValue_PlayerOptionsOverrides extends PlayerOptionsOverrides {
    private final Boolean repeatingContext;
    private final Boolean repeatingTrack;
    private final Boolean shufflingContext;

    C$AutoValue_PlayerOptionsOverrides(Boolean bool, Boolean bool2, Boolean bool3) {
        this.shufflingContext = bool;
        this.repeatingContext = bool2;
        this.repeatingTrack = bool3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOptionsOverrides)) {
            return false;
        }
        PlayerOptionsOverrides playerOptionsOverrides = (PlayerOptionsOverrides) obj;
        Boolean bool = this.shufflingContext;
        if (bool != null ? bool.equals(playerOptionsOverrides.shufflingContext()) : playerOptionsOverrides.shufflingContext() == null) {
            Boolean bool2 = this.repeatingContext;
            if (bool2 != null ? bool2.equals(playerOptionsOverrides.repeatingContext()) : playerOptionsOverrides.repeatingContext() == null) {
                Boolean bool3 = this.repeatingTrack;
                if (bool3 == null) {
                    if (playerOptionsOverrides.repeatingTrack() == null) {
                        return true;
                    }
                } else if (bool3.equals(playerOptionsOverrides.repeatingTrack())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Boolean bool = this.shufflingContext;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.repeatingContext;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.repeatingTrack;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides
    @JsonProperty("repeating_context")
    public Boolean repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides
    @JsonProperty("repeating_track")
    public Boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides
    @JsonProperty("shuffling_context")
    public Boolean shufflingContext() {
        return this.shufflingContext;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PlayerOptionsOverrides{shufflingContext=");
        V0.append(this.shufflingContext);
        V0.append(", repeatingContext=");
        V0.append(this.repeatingContext);
        V0.append(", repeatingTrack=");
        V0.append(this.repeatingTrack);
        V0.append("}");
        return V0.toString();
    }
}
