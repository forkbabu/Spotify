package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerSessionParameters implements JacksonModel {
    @JsonProperty("session")
    public String sessionUri;

    @JsonCreator
    public PlayerSessionParameters(@JsonProperty("session") String str) {
        this.sessionUri = str;
    }
}
