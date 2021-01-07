package com.spotify.podcast.endpoints.collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class CollectionEpisodesPolicy$DecorationPolicy implements JacksonModel {
    private final CollectionEpisodesPolicy$EpisodePolicy episodePolicy;

    public CollectionEpisodesPolicy$DecorationPolicy(@JsonProperty("list") CollectionEpisodesPolicy$EpisodePolicy collectionEpisodesPolicy$EpisodePolicy) {
        h.e(collectionEpisodesPolicy$EpisodePolicy, "episodePolicy");
        this.episodePolicy = collectionEpisodesPolicy$EpisodePolicy;
    }

    public final CollectionEpisodesPolicy$EpisodePolicy getEpisodePolicy() {
        return this.episodePolicy;
    }
}
