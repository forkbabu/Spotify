package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_DecorationPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class DecorationPolicy implements JacksonModel {

    public interface a {
        a a(EpisodeDecorationPolicy episodeDecorationPolicy);

        DecorationPolicy build();
    }

    public static a builder() {
        return new AutoValue_DecorationPolicy.b();
    }

    @JsonProperty("episode")
    public abstract EpisodeDecorationPolicy episodeDecorationPolicy();

    public abstract a toBuilder();
}
