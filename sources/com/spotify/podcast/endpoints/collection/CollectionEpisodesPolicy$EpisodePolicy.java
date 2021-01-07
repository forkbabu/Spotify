package com.spotify.podcast.endpoints.collection;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class CollectionEpisodesPolicy$EpisodePolicy implements JacksonModel {
    @JsonAnySetter
    private final Map<String, Boolean> attributes;
    private final a podcastSegmentsPolicy;
    private final b showPolicy;

    public CollectionEpisodesPolicy$EpisodePolicy(Map<String, Boolean> map, @JsonProperty("show") b bVar, @JsonProperty("podcastSegments") a aVar) {
        h.e(map, "attributes");
        h.e(bVar, "showPolicy");
        h.e(aVar, "podcastSegmentsPolicy");
        this.attributes = map;
        this.showPolicy = bVar;
        this.podcastSegmentsPolicy = aVar;
    }

    @JsonAnyGetter
    public final Map<String, Boolean> getAttributes() {
        return this.attributes;
    }

    public final a getPodcastSegmentsPolicy() {
        return this.podcastSegmentsPolicy;
    }

    public final b getShowPolicy() {
        return this.showPolicy;
    }
}
