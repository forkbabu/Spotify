package com.spotify.music.libs.assistedcuration.model;

import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RecsResponse extends RecsResponse {
    private final List<RecsTrack> recommendedTracks;

    AutoValue_RecsResponse(List<RecsTrack> list) {
        if (list != null) {
            this.recommendedTracks = list;
            return;
        }
        throw new NullPointerException("Null recommendedTracks");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecsResponse) {
            return this.recommendedTracks.equals(((RecsResponse) obj).getRecommendedTracks());
        }
        return false;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsResponse
    public List<RecsTrack> getRecommendedTracks() {
        return this.recommendedTracks;
    }

    public int hashCode() {
        return this.recommendedTracks.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("RecsResponse{recommendedTracks="), this.recommendedTracks, "}");
    }
}
