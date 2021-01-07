package com.spotify.music.features.album.offline.model;

import java.util.List;

final class AutoValue_TracksOfflineState extends TracksOfflineState {
    private final List<OfflineTrack> tracks;

    AutoValue_TracksOfflineState(List<OfflineTrack> list) {
        if (list != null) {
            this.tracks = list;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TracksOfflineState) {
            return this.tracks.equals(((TracksOfflineState) obj).getTracks());
        }
        return false;
    }

    @Override // com.spotify.music.features.album.offline.model.TracksOfflineState
    public List<OfflineTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("TracksOfflineState{tracks="), this.tracks, "}");
    }
}
