package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class VoiceAppProtocol$StartSession implements JacksonModel {
    @JsonCreator
    public static VoiceAppProtocol$StartSession create(@JsonProperty("session_id") String str, @JsonProperty("audio_mime_type") String str2) {
        return new AutoValue_VoiceAppProtocol_StartSession(str, str2);
    }

    @JsonProperty("audio_mime_type")
    public abstract String audioMimeType();

    @JsonProperty("session_id")
    public abstract String sessionId();
}
