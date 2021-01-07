package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_AlbumArtist extends AlbumArtist {
    private final String name;
    private final String uri;

    AutoValue_AlbumArtist(String str, String str2) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.uri = str2;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumArtist)) {
            return false;
        }
        AlbumArtist albumArtist = (AlbumArtist) obj;
        if (!this.name.equals(albumArtist.getName()) || !this.uri.equals(albumArtist.getUri())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.libs.album.AlbumArtist
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @Override // com.spotify.libs.album.AlbumArtist
    @JsonGetter("uri")
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((this.name.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumArtist{name=");
        V0.append(this.name);
        V0.append(", uri=");
        return je.I0(V0, this.uri, "}");
    }
}
