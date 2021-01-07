package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineResults extends OfflineResults {
    private static final long serialVersionUID = -5317210667781463632L;
    private final OfflineEpisodeList episodes;
    private final OfflinePlaylistList playlists;
    private final String searchTerm;
    private final OfflineTrackList tracks;

    AutoValue_OfflineResults(String str, OfflineTrackList offlineTrackList, OfflineEpisodeList offlineEpisodeList, OfflinePlaylistList offlinePlaylistList) {
        if (str != null) {
            this.searchTerm = str;
            if (offlineTrackList != null) {
                this.tracks = offlineTrackList;
                if (offlineEpisodeList != null) {
                    this.episodes = offlineEpisodeList;
                    if (offlinePlaylistList != null) {
                        this.playlists = offlinePlaylistList;
                        return;
                    }
                    throw new NullPointerException("Null playlists");
                }
                throw new NullPointerException("Null episodes");
            }
            throw new NullPointerException("Null tracks");
        }
        throw new NullPointerException("Null searchTerm");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineResults
    @JsonGetter("episodes")
    public OfflineEpisodeList episodes() {
        return this.episodes;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineResults)) {
            return false;
        }
        OfflineResults offlineResults = (OfflineResults) obj;
        if (!this.searchTerm.equals(offlineResults.searchTerm()) || !this.tracks.equals(offlineResults.tracks()) || !this.episodes.equals(offlineResults.episodes()) || !this.playlists.equals(offlineResults.playlists())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.searchTerm.hashCode() ^ 1000003) * 1000003) ^ this.tracks.hashCode()) * 1000003) ^ this.episodes.hashCode()) * 1000003) ^ this.playlists.hashCode();
    }

    @Override // com.spotify.libs.search.offline.model.OfflineResults
    @JsonGetter("playlists")
    public OfflinePlaylistList playlists() {
        return this.playlists;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineResults
    @JsonGetter("searchTerm")
    public String searchTerm() {
        return this.searchTerm;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OfflineResults{searchTerm=");
        V0.append(this.searchTerm);
        V0.append(", tracks=");
        V0.append(this.tracks);
        V0.append(", episodes=");
        V0.append(this.episodes);
        V0.append(", playlists=");
        V0.append(this.playlists);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.libs.search.offline.model.OfflineResults
    @JsonGetter("tracks")
    public OfflineTrackList tracks() {
        return this.tracks;
    }
}
