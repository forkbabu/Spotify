package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_Policy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Policy implements JacksonModel {

    public interface a {
        a a(DecorationPolicy decorationPolicy);

        Policy build();
    }

    public static a builder() {
        return new AutoValue_Policy.b();
    }

    @JsonProperty("policy")
    public abstract DecorationPolicy decorationPolicy();

    public abstract a toBuilder();
}
