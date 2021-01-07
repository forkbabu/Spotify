package com.spotify.music.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
final class c<T extends Serializable> {
    @JsonProperty("value")
    @JsonTypeInfo(include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", use = JsonTypeInfo.Id.CLASS)
    @JsonInclude(JsonInclude.Include.ALWAYS)
    final T mValue;

    @JsonCreator
    c(@JsonProperty("value") @JsonTypeInfo(include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", use = JsonTypeInfo.Id.CLASS) T t) {
        this.mValue = t;
    }
}
