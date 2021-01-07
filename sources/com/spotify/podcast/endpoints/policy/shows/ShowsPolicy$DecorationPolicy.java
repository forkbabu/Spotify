package com.spotify.podcast.endpoints.policy.shows;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ShowsPolicy$DecorationPolicy implements JacksonModel {
    private final ShowsPolicy$ListPolicy list;

    public ShowsPolicy$DecorationPolicy(@JsonProperty("list") ShowsPolicy$ListPolicy showsPolicy$ListPolicy) {
        h.e(showsPolicy$ListPolicy, "list");
        this.list = showsPolicy$ListPolicy;
    }

    public final ShowsPolicy$ListPolicy getList() {
        return this.list;
    }
}
