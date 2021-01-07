package com.spotify.podcast.endpoints.collection;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class a {
    @JsonAnySetter
    private final Map<String, Boolean> a;

    public a(Map<String, Boolean> map) {
        h.e(map, "attributes");
        this.a = map;
    }
}
