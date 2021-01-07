package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import java.util.List;

final class AutoValue_AlbumRecommendationsResponse extends AlbumRecommendationsResponse {
    private final List<AlbumRecommendation> albumRecommendations;

    AutoValue_AlbumRecommendationsResponse(List<AlbumRecommendation> list) {
        if (list != null) {
            this.albumRecommendations = list;
            return;
        }
        throw new NullPointerException("Null albumRecommendations");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlbumRecommendationsResponse) {
            return this.albumRecommendations.equals(((AlbumRecommendationsResponse) obj).getAlbumRecommendations());
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.endpoint.model.AlbumRecommendationsResponse
    public List<AlbumRecommendation> getAlbumRecommendations() {
        return this.albumRecommendations;
    }

    public int hashCode() {
        return this.albumRecommendations.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("AlbumRecommendationsResponse{albumRecommendations="), this.albumRecommendations, "}");
    }
}
