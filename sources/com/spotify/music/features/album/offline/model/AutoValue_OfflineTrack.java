package com.spotify.music.features.album.offline.model;

import com.spotify.playlist.models.offline.a;

final class AutoValue_OfflineTrack extends OfflineTrack {
    private final a offlineState;
    private final String uri;

    AutoValue_OfflineTrack(a aVar, String str) {
        if (aVar != null) {
            this.offlineState = aVar;
            if (str != null) {
                this.uri = str;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null offlineState");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineTrack)) {
            return false;
        }
        OfflineTrack offlineTrack = (OfflineTrack) obj;
        if (!this.offlineState.equals(offlineTrack.getOfflineState()) || !this.uri.equals(offlineTrack.getUri())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.album.offline.model.OfflineTrack
    public a getOfflineState() {
        return this.offlineState;
    }

    @Override // com.spotify.music.features.album.offline.model.OfflineTrack
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineTrack{offlineState=");
        V0.append(this.offlineState);
        V0.append(", uri=");
        return je.I0(V0, this.uri, "}");
    }
}
