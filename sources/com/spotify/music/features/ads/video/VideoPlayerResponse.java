package com.spotify.music.features.ads.video;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VideoPlayerResponse implements JacksonModel {
    @JsonCreator
    public static VideoPlayerResponse create(@JsonProperty("type") String str, @JsonProperty("advance_reason") String str2) {
        return new AutoValue_VideoPlayerResponse(str, str2);
    }

    @JsonProperty("advance_reason")
    public abstract String advancedReason();

    @JsonProperty("type")
    public abstract String type();
}
