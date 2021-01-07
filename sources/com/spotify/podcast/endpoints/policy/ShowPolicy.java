package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_ShowPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ShowPolicy implements JacksonModel {

    public interface a {
        a a(ShowDecorationPolicy showDecorationPolicy);

        ShowPolicy build();
    }

    public static a builder() {
        return new AutoValue_ShowPolicy.b();
    }

    @JsonProperty("policy")
    public abstract ShowDecorationPolicy listDecorationPolicy();

    public abstract a toBuilder();
}
