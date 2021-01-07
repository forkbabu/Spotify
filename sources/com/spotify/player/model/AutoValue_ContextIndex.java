package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* access modifiers changed from: package-private */
public final class AutoValue_ContextIndex extends ContextIndex {
    private final long page;
    private final long track;

    AutoValue_ContextIndex(long j, long j2) {
        this.page = j;
        this.track = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextIndex)) {
            return false;
        }
        ContextIndex contextIndex = (ContextIndex) obj;
        if (this.page == contextIndex.page() && this.track == contextIndex.track()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.page;
        long j2 = this.track;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    @Override // com.spotify.player.model.ContextIndex
    @JsonProperty("page")
    public long page() {
        return this.page;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextIndex{page=");
        V0.append(this.page);
        V0.append(", track=");
        return je.E0(V0, this.track, "}");
    }

    @Override // com.spotify.player.model.ContextIndex
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public long track() {
        return this.track;
    }
}
