package com.spotify.music.features.userplaylistresolver.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.userplaylistresolver.api.AutoValue_IntentToUriV1Response;

@JsonDeserialize(builder = Builder.class)
public abstract class IntentToUriV1Response {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        static Builder create() {
            return new AutoValue_IntentToUriV1Response.Builder();
        }

        public abstract IntentToUriV1Response build();

        @JsonProperty("uri")
        public abstract Builder resolvedUri(String str);
    }

    public abstract String a();
}
