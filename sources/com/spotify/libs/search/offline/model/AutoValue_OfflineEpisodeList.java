package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineEpisodeList extends OfflineEpisodeList {
    private static final long serialVersionUID = -574000858124179211L;
    private final List<OfflineEpisode> hits;

    AutoValue_OfflineEpisodeList(List<OfflineEpisode> list) {
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
        if (obj instanceof OfflineEpisodeList) {
            return this.hits.equals(((OfflineEpisodeList) obj).hits());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.hits.hashCode() ^ 1000003;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEpisodeList, com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public List<OfflineEpisode> hits() {
        return this.hits;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("OfflineEpisodeList{hits="), this.hits, "}");
    }
}
