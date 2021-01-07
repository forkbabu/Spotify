package com.spotify.podcast.endpoints.policy.shows;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ShowsPolicy$Policy implements JacksonModel {
    private final ShowsPolicy$DecorationPolicy policy;

    public ShowsPolicy$Policy(@JsonProperty("policy") ShowsPolicy$DecorationPolicy showsPolicy$DecorationPolicy) {
        h.e(showsPolicy$DecorationPolicy, "policy");
        this.policy = showsPolicy$DecorationPolicy;
    }

    public final ShowsPolicy$DecorationPolicy getPolicy() {
        return this.policy;
    }
}
