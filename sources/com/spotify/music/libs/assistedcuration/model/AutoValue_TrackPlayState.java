package com.spotify.music.libs.assistedcuration.model;

import com.spotify.playlist.models.PlayabilityRestriction;

final class AutoValue_TrackPlayState extends TrackPlayState {
    private final PlayabilityRestriction playabilityRestriction;
    private final boolean playable;

    AutoValue_TrackPlayState(boolean z, PlayabilityRestriction playabilityRestriction2) {
        this.playable = z;
        if (playabilityRestriction2 != null) {
            this.playabilityRestriction = playabilityRestriction2;
            return;
        }
        throw new NullPointerException("Null playabilityRestriction");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackPlayState)) {
            return false;
        }
        TrackPlayState trackPlayState = (TrackPlayState) obj;
        if (this.playable != trackPlayState.isPlayable() || !this.playabilityRestriction.equals(trackPlayState.getPlayabilityRestriction())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.TrackPlayState
    public PlayabilityRestriction getPlayabilityRestriction() {
        return this.playabilityRestriction;
    }

    public int hashCode() {
        return (((this.playable ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.playabilityRestriction.hashCode();
    }

    @Override // com.spotify.music.libs.assistedcuration.model.TrackPlayState
    public boolean isPlayable() {
        return this.playable;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackPlayState{playable=");
        V0.append(this.playable);
        V0.append(", playabilityRestriction=");
        V0.append(this.playabilityRestriction);
        V0.append("}");
        return V0.toString();
    }
}
