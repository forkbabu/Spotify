package com.spotify.music.lyrics.vocalremoval.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.lyrics.vocalremoval.model.$AutoValue_KaraokeVocalVolume  reason: invalid class name */
abstract class C$AutoValue_KaraokeVocalVolume extends KaraokeVocalVolume {
    private final Double vocalVolume;

    C$AutoValue_KaraokeVocalVolume(Double d) {
        if (d != null) {
            this.vocalVolume = d;
            return;
        }
        throw new NullPointerException("Null vocalVolume");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KaraokeVocalVolume) {
            return this.vocalVolume.equals(((KaraokeVocalVolume) obj).vocalVolume());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.vocalVolume.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("KaraokeVocalVolume{vocalVolume=");
        V0.append(this.vocalVolume);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeVocalVolume
    @JsonProperty("volume")
    public Double vocalVolume() {
        return this.vocalVolume;
    }
}
