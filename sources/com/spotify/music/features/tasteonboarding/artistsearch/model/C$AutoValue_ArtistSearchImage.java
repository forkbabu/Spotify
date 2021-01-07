package com.spotify.music.features.tasteonboarding.artistsearch.model;

/* renamed from: com.spotify.music.features.tasteonboarding.artistsearch.model.$AutoValue_ArtistSearchImage  reason: invalid class name */
abstract class C$AutoValue_ArtistSearchImage extends ArtistSearchImage {
    private final int height;
    private final String uri;
    private final int width;

    C$AutoValue_ArtistSearchImage(String str, int i, int i2) {
        if (str != null) {
            this.uri = str;
            this.height = i;
            this.width = i2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArtistSearchImage)) {
            return false;
        }
        ArtistSearchImage artistSearchImage = (ArtistSearchImage) obj;
        if (this.uri.equals(artistSearchImage.uri()) && this.height == artistSearchImage.height() && this.width == artistSearchImage.width()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchImage
    public int height() {
        return this.height;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ArtistSearchImage{uri=");
        V0.append(this.uri);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", width=");
        return je.B0(V0, this.width, "}");
    }

    @Override // com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchImage
    public String uri() {
        return this.uri;
    }

    @Override // com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchImage
    public int width() {
        return this.width;
    }
}
