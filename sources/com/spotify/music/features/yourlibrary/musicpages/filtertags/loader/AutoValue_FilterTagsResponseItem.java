package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_FilterTagsResponseItem extends FilterTagsResponseItem {
    private final String query;
    private final String title;

    AutoValue_FilterTagsResponseItem(String str, String str2) {
        if (str != null) {
            this.title = str;
            if (str2 != null) {
                this.query = str2;
                return;
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null title");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterTagsResponseItem)) {
            return false;
        }
        FilterTagsResponseItem filterTagsResponseItem = (FilterTagsResponseItem) obj;
        if (!this.title.equals(filterTagsResponseItem.title()) || !this.query.equals(filterTagsResponseItem.query())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.title.hashCode() ^ 1000003) * 1000003) ^ this.query.hashCode();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem
    @JsonProperty("query")
    public String query() {
        return this.query;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterTagsResponseItem{title=");
        V0.append(this.title);
        V0.append(", query=");
        return je.I0(V0, this.query, "}");
    }
}
