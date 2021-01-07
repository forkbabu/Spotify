package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FilterTagsResponse implements JacksonModel {
    @JsonCreator
    public static FilterTagsResponse create(@JsonProperty("contentFilters") List<FilterTagsResponseItem> list) {
        return new AutoValue_FilterTagsResponse(list);
    }

    @JsonProperty("contentFilters")
    public abstract List<FilterTagsResponseItem> contentFilters();
}
