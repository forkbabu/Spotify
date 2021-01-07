package com.spotify.podcast.endpoints.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PodcastDecorateBody implements JacksonModel {
    private final ImmutableList<String> items;

    public PodcastDecorateBody(@JsonProperty("items") ImmutableList<String> immutableList) {
        h.e(immutableList, "items");
        this.items = immutableList;
    }

    public final ImmutableList<String> getItems() {
        return this.items;
    }
}
