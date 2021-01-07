package com.spotify.libs.search.history;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchHistory implements JacksonModel, Serializable {
    private static final long serialVersionUID = 6790688351676525479L;

    @JsonCreator
    public static SearchHistory create(@JsonProperty("items") List<SearchHistoryItem> list) {
        return new AutoValue_SearchHistory(list);
    }

    @JsonGetter("items")
    public abstract List<SearchHistoryItem> getItems();
}
