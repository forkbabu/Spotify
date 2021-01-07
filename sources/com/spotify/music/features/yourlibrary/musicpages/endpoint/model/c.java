package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

final class c extends a {
    private final String a;

    c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.endpoint.model.a
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ArtistRecommendation{uri="), this.a, "}");
    }
}
