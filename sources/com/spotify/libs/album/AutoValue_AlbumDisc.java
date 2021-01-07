package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

final class AutoValue_AlbumDisc extends AlbumDisc {
    private final List<c> tracks;

    AutoValue_AlbumDisc(List<c> list) {
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
        if (obj instanceof AlbumDisc) {
            return this.tracks.equals(((AlbumDisc) obj).getTracks());
        }
        return false;
    }

    @Override // com.spotify.libs.album.AlbumDisc
    @JsonGetter("tracks")
    public List<c> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("AlbumDisc{tracks="), this.tracks, "}");
    }
}
