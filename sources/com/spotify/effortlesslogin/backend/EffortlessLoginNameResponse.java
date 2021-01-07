package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class EffortlessLoginNameResponse implements JacksonModel {
    @JsonCreator
    public static EffortlessLoginNameResponse create(@JsonProperty("full_name") String str) {
        return new AutoValue_EffortlessLoginNameResponse(str);
    }

    @JsonGetter("full_name")
    public abstract String fullName();
}
