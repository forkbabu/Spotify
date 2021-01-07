package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import java.util.List;

final class AutoValue_AlbumRelease extends AlbumRelease {
    private final AlbumCover cover;
    private final List<AlbumDisc> discs;
    private final int trackCount;

    AutoValue_AlbumRelease(int i, List<AlbumDisc> list, AlbumCover albumCover) {
        this.trackCount = i;
        if (list != null) {
            this.discs = list;
            this.cover = albumCover;
            return;
        }
        throw new NullPointerException("Null discs");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumRelease)) {
            return false;
        }
        AlbumRelease albumRelease = (AlbumRelease) obj;
        if (this.trackCount == albumRelease.getTrackCount() && this.discs.equals(albumRelease.getDiscs())) {
            AlbumCover albumCover = this.cover;
            if (albumCover == null) {
                if (albumRelease.getCover() == null) {
                    return true;
                }
            } else if (albumCover.equals(albumRelease.getCover())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.libs.album.AlbumRelease
    @JsonGetter("cover")
    public AlbumCover getCover() {
        return this.cover;
    }

    @Override // com.spotify.libs.album.AlbumRelease
    @JsonGetter("discs")
    public List<AlbumDisc> getDiscs() {
        return this.discs;
    }

    @Override // com.spotify.libs.album.AlbumRelease
    @JsonGetter(PlayerContext.Metadata.KEY_TRACK_COUNT)
    public int getTrackCount() {
        return this.trackCount;
    }

    public int hashCode() {
        int hashCode = (((this.trackCount ^ 1000003) * 1000003) ^ this.discs.hashCode()) * 1000003;
        AlbumCover albumCover = this.cover;
        return hashCode ^ (albumCover == null ? 0 : albumCover.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumRelease{trackCount=");
        V0.append(this.trackCount);
        V0.append(", discs=");
        V0.append(this.discs);
        V0.append(", cover=");
        V0.append(this.cover);
        V0.append("}");
        return V0.toString();
    }
}
