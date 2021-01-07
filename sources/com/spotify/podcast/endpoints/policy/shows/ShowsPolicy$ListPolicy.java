package com.spotify.podcast.endpoints.policy.shows;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ShowsPolicy$ListPolicy implements JacksonModel {
    @JsonAnySetter
    private final ImmutableMap<String, Boolean> attributes;

    public ShowsPolicy$ListPolicy(ImmutableMap<String, Boolean> immutableMap) {
        h.e(immutableMap, "attributes");
        this.attributes = immutableMap;
    }

    @JsonAnyGetter
    public final ImmutableMap<String, Boolean> getAttributes() {
        return this.attributes;
    }
}
