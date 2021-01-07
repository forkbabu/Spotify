package com.spotify.music.features.settings.adapter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_ResyncBitratePreference extends ResyncBitratePreference {
    private final boolean resyncBitrateV2;

    AutoValue_ResyncBitratePreference(boolean z) {
        this.resyncBitrateV2 = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResyncBitratePreference) || this.resyncBitrateV2 != ((ResyncBitratePreference) obj).getResyncBitrateV2()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.settings.adapter.model.ResyncBitratePreference
    @JsonProperty("audio.resync_bitrate_v2")
    public boolean getResyncBitrateV2() {
        return this.resyncBitrateV2;
    }

    public int hashCode() {
        return (this.resyncBitrateV2 ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("ResyncBitratePreference{resyncBitrateV2="), this.resyncBitrateV2, "}");
    }
}
