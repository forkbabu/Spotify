package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class e {
    @JsonCreator
    public static e create(@JsonProperty("success") boolean z, @JsonProperty("result") List<g> list, @JsonProperty("errors") List<String> list2) {
        return new a(z, gf0.a(list), gf0.a(list2));
    }

    @JsonProperty("errors")
    public abstract List<String> errors();

    @JsonProperty("result")
    public abstract List<g> results();

    @JsonProperty("success")
    public abstract boolean success();
}
