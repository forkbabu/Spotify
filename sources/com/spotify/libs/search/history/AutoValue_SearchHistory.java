package com.spotify.libs.search.history;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_SearchHistory extends SearchHistory {
    private static final long serialVersionUID = 6790688351676525479L;
    private final List<SearchHistoryItem> items;

    AutoValue_SearchHistory(List<SearchHistoryItem> list) {
        if (list != null) {
            this.items = list;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchHistory) {
            return this.items.equals(((SearchHistory) obj).getItems());
        }
        return false;
    }

    @Override // com.spotify.libs.search.history.SearchHistory
    @JsonGetter("items")
    public List<SearchHistoryItem> getItems() {
        return this.items;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.items.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("SearchHistory{items="), this.items, "}");
    }
}
