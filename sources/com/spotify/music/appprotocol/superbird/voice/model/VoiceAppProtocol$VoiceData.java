package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.nio.ByteBuffer;

public abstract class VoiceAppProtocol$VoiceData implements JacksonModel {
    @JsonCreator
    public static VoiceAppProtocol$VoiceData create(@JsonProperty("session_id") String str, @JsonProperty("voice_data") byte[] bArr) {
        return new AutoValue_VoiceAppProtocol_VoiceData(str, ByteBuffer.wrap(bArr));
    }

    @JsonProperty("session_id")
    public abstract String sessionId();

    @JsonProperty("voice_data")
    public abstract ByteBuffer voiceData();
}
