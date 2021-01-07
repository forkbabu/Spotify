package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AsrResponse implements JacksonModel {
    @JsonCreator
    public static AsrResponse create(@JsonProperty("transcript") String str, @JsonProperty("isFinal") boolean z, @JsonProperty("isEndOfSpeech") boolean z2, @JsonProperty("score") float f) {
        return new AutoValue_AsrResponse(str, z, z2, f);
    }

    @JsonProperty("isEndOfSpeech")
    public abstract boolean isEndOfSpeech();

    @JsonProperty("isFinal")
    public abstract boolean isFinal();

    @JsonProperty("score")
    public abstract float score();

    @JsonProperty("transcript")
    public abstract String transcript();
}
