package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcast.endpoints.policy.AutoValue_KeyValuePolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class KeyValuePolicy implements JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        KeyValuePolicy build();
    }

    public static a builder() {
        return new AutoValue_KeyValuePolicy.b();
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> attributes();

    public abstract a toBuilder();
}
