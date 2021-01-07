package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import java.util.List;

final class d extends b {
    private final List<a> a;

    d(List<a> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null artistRecommendations");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.endpoint.model.b
    public List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("ArtistRecommendationsResponse{artistRecommendations="), this.a, "}");
    }
}
