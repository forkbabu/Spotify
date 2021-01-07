package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_ShowDecorationPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ShowDecorationPolicy implements JacksonModel {

    public interface a {
        a a(EpisodeDecorationPolicy episodeDecorationPolicy);

        a b(KeyValuePolicy keyValuePolicy);

        ShowDecorationPolicy build();
    }

    public static a builder() {
        return new AutoValue_ShowDecorationPolicy.b();
    }

    @JsonProperty("sections")
    public abstract KeyValuePolicy auxiliarySectionsPolicy();

    @JsonProperty("list")
    public abstract EpisodeDecorationPolicy episodeDecorationPolicy();

    @JsonProperty("header")
    public abstract KeyValuePolicy headerPolicy();

    public abstract a toBuilder();
}
