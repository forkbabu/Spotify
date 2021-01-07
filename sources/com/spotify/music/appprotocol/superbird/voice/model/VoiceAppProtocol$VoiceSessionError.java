package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.voice.api.VoiceSessionException;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class VoiceAppProtocol$VoiceSessionError implements JacksonModel {
    public static VoiceAppProtocol$VoiceSessionError create(VoiceSessionException voiceSessionException) {
        return create(voiceSessionException.a().toString(), voiceSessionException.b().b(), voiceSessionException.getCause() != null ? voiceSessionException.getCause().toString() : "");
    }

    @JsonProperty("cause")
    public abstract String cause();

    @JsonProperty("domain")
    public abstract String domain();

    @JsonProperty("type")
    public abstract String type();

    @JsonCreator
    public static VoiceAppProtocol$VoiceSessionError create(@JsonProperty("domain") String str, @JsonProperty("type") String str2, @JsonProperty("cause") String str3) {
        return new AutoValue_VoiceAppProtocol_VoiceSessionError(str, str2, str3);
    }
}
