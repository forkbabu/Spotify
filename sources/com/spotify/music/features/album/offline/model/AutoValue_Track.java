package com.spotify.music.features.album.offline.model;

import com.spotify.playlist.models.offline.a;

final class AutoValue_Track extends Track {
    private final String link;
    private final a offlineState;

    AutoValue_Track(a aVar, String str) {
        if (aVar != null) {
            this.offlineState = aVar;
            if (str != null) {
                this.link = str;
                return;
            }
            throw new NullPointerException("Null link");
        }
        throw new NullPointerException("Null offlineState");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        if (!this.offlineState.equals(track.getOfflineState()) || !this.link.equals(track.getLink())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.album.offline.model.Track
    public String getLink() {
        return this.link;
    }

    @Override // com.spotify.music.features.album.offline.model.Track
    public a getOfflineState() {
        return this.offlineState;
    }

    public int hashCode() {
        return ((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.link.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Track{offlineState=");
        V0.append(this.offlineState);
        V0.append(", link=");
        return je.I0(V0, this.link, "}");
    }
}
