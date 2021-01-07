package com.spotify.music.offlinetrials.limited.trackentity.endpoint;

import java.util.List;

final class AutoValue_OfflineTracks extends OfflineTracks {
    private final List<OfflineTrack> tracks;

    AutoValue_OfflineTracks(List<OfflineTrack> list) {
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
        if (obj instanceof OfflineTracks) {
            return this.tracks.equals(((OfflineTracks) obj).getTracks());
        }
        return false;
    }

    @Override // com.spotify.music.offlinetrials.limited.trackentity.endpoint.OfflineTracks
    public List<OfflineTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("OfflineTracks{tracks="), this.tracks, "}");
    }
}
