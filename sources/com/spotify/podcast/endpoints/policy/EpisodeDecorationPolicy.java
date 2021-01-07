package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_EpisodeDecorationPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class EpisodeDecorationPolicy implements JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        a b(KeyValuePolicy keyValuePolicy);

        EpisodeDecorationPolicy build();

        a c(KeyValuePolicy keyValuePolicy);
    }

    public static a builder() {
        return new AutoValue_EpisodeDecorationPolicy.b();
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> episodeAttributes();

    @JsonProperty("podcastSegments")
    public abstract KeyValuePolicy podcastSegmentsPolicy();

    @JsonProperty("show")
    public abstract KeyValuePolicy showDecorationPolicy();

    public abstract a toBuilder();
}
