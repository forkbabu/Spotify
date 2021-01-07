package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerRestrictions extends PlayerRestrictions {
    private final boolean canRepeatContext;
    private final boolean canRepeatTrack;
    private final boolean canSeek;
    private final boolean canSkipNext;
    private final boolean canSkipPrev;
    private final boolean canToggleShuffle;

    AutoValue_PlayerRestrictions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.canSkipNext = z;
        this.canSkipPrev = z2;
        this.canRepeatTrack = z3;
        this.canRepeatContext = z4;
        this.canToggleShuffle = z5;
        this.canSeek = z6;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_repeat_context")
    public boolean canRepeatContext() {
        return this.canRepeatContext;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_repeat_track")
    public boolean canRepeatTrack() {
        return this.canRepeatTrack;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_seek")
    public boolean canSeek() {
        return this.canSeek;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_skip_next")
    public boolean canSkipNext() {
        return this.canSkipNext;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_skip_prev")
    public boolean canSkipPrev() {
        return this.canSkipPrev;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.model.PlayerRestrictions
    @JsonProperty("can_toggle_shuffle")
    public boolean canToggleShuffle() {
        return this.canToggleShuffle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerRestrictions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = (PlayerRestrictions) obj;
        if (this.canSkipNext == playerRestrictions.canSkipNext() && this.canSkipPrev == playerRestrictions.canSkipPrev() && this.canRepeatTrack == playerRestrictions.canRepeatTrack() && this.canRepeatContext == playerRestrictions.canRepeatContext() && this.canToggleShuffle == playerRestrictions.canToggleShuffle() && this.canSeek == playerRestrictions.canSeek()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((this.canSkipNext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.canSkipPrev ? 1231 : 1237)) * 1000003) ^ (this.canRepeatTrack ? 1231 : 1237)) * 1000003) ^ (this.canRepeatContext ? 1231 : 1237)) * 1000003) ^ (this.canToggleShuffle ? 1231 : 1237)) * 1000003;
        if (!this.canSeek) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerRestrictions{canSkipNext=");
        V0.append(this.canSkipNext);
        V0.append(", canSkipPrev=");
        V0.append(this.canSkipPrev);
        V0.append(", canRepeatTrack=");
        V0.append(this.canRepeatTrack);
        V0.append(", canRepeatContext=");
        V0.append(this.canRepeatContext);
        V0.append(", canToggleShuffle=");
        V0.append(this.canToggleShuffle);
        V0.append(", canSeek=");
        return je.P0(V0, this.canSeek, "}");
    }
}
