package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineTrackList extends OfflineTrackList {
    private static final long serialVersionUID = -5488772392642581215L;
    private final List<OfflineTrack> hits;

    AutoValue_OfflineTrackList(List<OfflineTrack> list) {
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
        if (obj instanceof OfflineTrackList) {
            return this.hits.equals(((OfflineTrackList) obj).hits());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.hits.hashCode() ^ 1000003;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackList, com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public List<OfflineTrack> hits() {
        return this.hits;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("OfflineTrackList{hits="), this.hits, "}");
    }
}
