package com.spotify.podcast.endpoints.collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class CollectionEpisodesPolicy$Policy implements JacksonModel {
    private final CollectionEpisodesPolicy$DecorationPolicy policy;

    public CollectionEpisodesPolicy$Policy(@JsonProperty("policy") CollectionEpisodesPolicy$DecorationPolicy collectionEpisodesPolicy$DecorationPolicy) {
        h.e(collectionEpisodesPolicy$DecorationPolicy, "policy");
        this.policy = collectionEpisodesPolicy$DecorationPolicy;
    }

    public final CollectionEpisodesPolicy$DecorationPolicy getPolicy() {
        return this.policy;
    }
}
