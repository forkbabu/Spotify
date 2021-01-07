package com.spotify.music.appprotocol.volume;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_VolumeState extends VolumeState {
    private final boolean controllable;
    private final float volume;

    AutoValue_VolumeState(float f, boolean z) {
        this.volume = f;
        this.controllable = z;
    }

    @Override // com.spotify.music.appprotocol.volume.VolumeState
    @JsonProperty("controllable")
    public boolean controllable() {
        return this.controllable;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VolumeState)) {
            return false;
        }
        VolumeState volumeState = (VolumeState) obj;
        if (Float.floatToIntBits(this.volume) == Float.floatToIntBits(volumeState.volume()) && this.controllable == volumeState.controllable()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.volume) ^ 1000003) * 1000003) ^ (this.controllable ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("VolumeState{volume=");
        V0.append(this.volume);
        V0.append(", controllable=");
        return je.P0(V0, this.controllable, "}");
    }

    @Override // com.spotify.music.appprotocol.volume.VolumeState
    @JsonProperty("volume")
    public float volume() {
        return this.volume;
    }
}
