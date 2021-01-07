package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

final class AutoValue_AlbumRecommendation extends AlbumRecommendation {
    private final String uri;

    AutoValue_AlbumRecommendation(String str) {
        if (str != null) {
            this.uri = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlbumRecommendation) {
            return this.uri.equals(((AlbumRecommendation) obj).getUri());
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.endpoint.model.AlbumRecommendation
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("AlbumRecommendation{uri="), this.uri, "}");
    }
}
