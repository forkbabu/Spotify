package com.spotify.music.appprotocol.volume;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_VolumeLevel extends VolumeLevel {
    private final float volume;

    AutoValue_VolumeLevel(float f) {
        this.volume = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VolumeLevel) || Float.floatToIntBits(this.volume) != Float.floatToIntBits(((VolumeLevel) obj).volume())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VolumeLevel{volume=");
        V0.append(this.volume);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.appprotocol.volume.VolumeLevel
    @JsonProperty("volume")
    public float volume() {
        return this.volume;
    }
}
