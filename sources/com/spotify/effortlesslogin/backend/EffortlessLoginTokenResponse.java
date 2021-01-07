package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class EffortlessLoginTokenResponse implements JacksonModel {
    @JsonCreator
    public static EffortlessLoginTokenResponse create(@JsonProperty("token") String str) {
        return new AutoValue_EffortlessLoginTokenResponse(str);
    }

    @JsonGetter("token")
    public abstract String token();
}
