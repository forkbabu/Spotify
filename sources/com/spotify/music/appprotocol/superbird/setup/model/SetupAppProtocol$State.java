package com.spotify.music.appprotocol.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class SetupAppProtocol$State implements JacksonModel {
    public static SetupAppProtocol$State create(String str) {
        return new AutoValue_SetupAppProtocol_State(str);
    }

    @JsonProperty("state")
    public abstract String state();

    public static SetupAppProtocol$State create(boolean z) {
        return create(z ? "finished" : "unfinished");
    }
}
