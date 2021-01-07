package com.spotify.music.libs.assistedcuration.model;

import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RecentlyPlayedTracksResponse extends RecentlyPlayedTracksResponse {
    private final List<ResponseTrack> tracks;

    AutoValue_RecentlyPlayedTracksResponse(List<ResponseTrack> list) {
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
        if (obj instanceof RecentlyPlayedTracksResponse) {
            return this.tracks.equals(((RecentlyPlayedTracksResponse) obj).getTracks());
        }
        return false;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecentlyPlayedTracksResponse
    public List<ResponseTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("RecentlyPlayedTracksResponse{tracks="), this.tracks, "}");
    }
}
