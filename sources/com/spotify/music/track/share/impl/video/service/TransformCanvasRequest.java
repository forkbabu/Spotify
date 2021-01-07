package com.spotify.music.track.share.impl.video.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class TransformCanvasRequest implements JacksonModel {
    @JsonCreator
    public static TransformCanvasRequest create(@JsonProperty("canvasUrl") String str) {
        return new AutoValue_TransformCanvasRequest(str);
    }

    @JsonGetter("canvasUrl")
    public abstract String canvasUrl();
}
