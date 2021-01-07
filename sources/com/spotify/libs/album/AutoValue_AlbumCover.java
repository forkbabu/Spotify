package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_AlbumCover extends AlbumCover {
    private final String uri;

    AutoValue_AlbumCover(String str) {
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
        if (obj instanceof AlbumCover) {
            return this.uri.equals(((AlbumCover) obj).getUri());
        }
        return false;
    }

    @Override // com.spotify.libs.album.AlbumCover
    @JsonGetter("uri")
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("AlbumCover{uri="), this.uri, "}");
    }
}
