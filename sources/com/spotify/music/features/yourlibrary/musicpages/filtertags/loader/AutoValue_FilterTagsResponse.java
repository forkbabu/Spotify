package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_FilterTagsResponse extends FilterTagsResponse {
    private final List<FilterTagsResponseItem> contentFilters;

    AutoValue_FilterTagsResponse(List<FilterTagsResponseItem> list) {
        this.contentFilters = list;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse
    @JsonProperty("contentFilters")
    public List<FilterTagsResponseItem> contentFilters() {
        return this.contentFilters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterTagsResponse)) {
            return false;
        }
        List<FilterTagsResponseItem> list = this.contentFilters;
        List<FilterTagsResponseItem> contentFilters2 = ((FilterTagsResponse) obj).contentFilters();
        if (list != null) {
            return list.equals(contentFilters2);
        }
        if (contentFilters2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<FilterTagsResponseItem> list = this.contentFilters;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("FilterTagsResponse{contentFilters="), this.contentFilters, "}");
    }
}
