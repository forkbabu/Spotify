package com.spotify.music.features.album.offline.model;

import java.util.List;

final class AutoValue_OfflineState extends OfflineState {
    private final Album album;
    private final List<Track> tracks;

    AutoValue_OfflineState(Album album2, List<Track> list) {
        if (album2 != null) {
            this.album = album2;
            if (list != null) {
                this.tracks = list;
                return;
            }
            throw new NullPointerException("Null tracks");
        }
        throw new NullPointerException("Null album");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineState)) {
            return false;
        }
        OfflineState offlineState = (OfflineState) obj;
        if (!this.album.equals(offlineState.getAlbum()) || !this.tracks.equals(offlineState.getTracks())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.album.offline.model.OfflineState
    public Album getAlbum() {
        return this.album;
    }

    @Override // com.spotify.music.features.album.offline.model.OfflineState
    public List<Track> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return ((this.album.hashCode() ^ 1000003) * 1000003) ^ this.tracks.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineState{album=");
        V0.append(this.album);
        V0.append(", tracks=");
        return je.L0(V0, this.tracks, "}");
    }
}
