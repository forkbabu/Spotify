package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FilterTagsResponseItem implements JacksonModel {
    @JsonCreator
    public static FilterTagsResponseItem create(@JsonProperty("title") String str, @JsonProperty("query") String str2) {
        return new AutoValue_FilterTagsResponseItem(str, str2);
    }

    @JsonProperty("query")
    public abstract String query();

    @JsonProperty("title")
    public abstract String title();
}
