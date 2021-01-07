package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class VoiceAppProtocol$CancelSession implements JacksonModel {
    @JsonCreator
    public static VoiceAppProtocol$CancelSession create(@JsonProperty("session_id") String str) {
        return new AutoValue_VoiceAppProtocol_CancelSession(str);
    }

    @JsonProperty("session_id")
    public abstract String sessionId();
}
