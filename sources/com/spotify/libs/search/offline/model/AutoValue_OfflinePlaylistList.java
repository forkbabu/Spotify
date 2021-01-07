package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflinePlaylistList extends OfflinePlaylistList {
    private static final long serialVersionUID = 5640818632950048238L;
    private final List<OfflinePlaylist> hits;

    AutoValue_OfflinePlaylistList(List<OfflinePlaylist> list) {
        if (list != null) {
            this.hits = list;
            return;
        }
        throw new NullPointerException("Null hits");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflinePlaylistList) {
            return this.hits.equals(((OfflinePlaylistList) obj).hits());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.hits.hashCode() ^ 1000003;
    }

    @Override // com.spotify.libs.search.offline.model.OfflinePlaylistList, com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public List<OfflinePlaylist> hits() {
        return this.hits;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("OfflinePlaylistList{hits="), this.hits, "}");
    }
}
