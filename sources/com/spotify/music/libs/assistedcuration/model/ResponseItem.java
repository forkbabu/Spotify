package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ResponseItem implements JacksonModel {
    @JsonCreator
    public static ResponseItem create(@JsonProperty("link") String str, @JsonProperty("name") String str2) {
        return new AutoValue_ResponseItem(str, str2);
    }

    public abstract String getName();

    public abstract String getUri();
}
