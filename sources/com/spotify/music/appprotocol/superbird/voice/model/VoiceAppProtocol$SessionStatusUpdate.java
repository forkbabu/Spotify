package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.AsrResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class VoiceAppProtocol$SessionStatusUpdate implements JacksonModel {
    private static VoiceAppProtocol$SessionStatusUpdate create(String str, String str2, String str3, VoiceAppProtocol$VoiceSessionError voiceAppProtocol$VoiceSessionError, AsrResponse asrResponse, JsonNode jsonNode) {
        return new AutoValue_VoiceAppProtocol_SessionStatusUpdate(str, str2, str3, voiceAppProtocol$VoiceSessionError, asrResponse, jsonNode);
    }

    public static VoiceAppProtocol$SessionStatusUpdate createAsr(String str, String str2, AsrResponse asrResponse) {
        return create(str, str2, "AsrResponse", null, asrResponse, null);
    }

    public static VoiceAppProtocol$SessionStatusUpdate createError(String str, String str2, Throwable th) {
        if (th instanceof VoiceSessionException) {
            return create(str, str2, "VoiceSessionException", VoiceAppProtocol$VoiceSessionError.create((VoiceSessionException) th), null, null);
        }
        return create(str, str2, "VoiceSessionException", VoiceAppProtocol$VoiceSessionError.create("UNKNOWN", "UNKNOWN", th.toString()), null, null);
    }

    public static VoiceAppProtocol$SessionStatusUpdate createNlu(String str, String str2, JsonNode jsonNode) {
        return create(str, str2, "NluResponse", null, null, jsonNode);
    }

    @JsonProperty("asr")
    public abstract AsrResponse asr();

    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public abstract VoiceAppProtocol$VoiceSessionError error();

    @JsonProperty("message")
    public abstract String message();

    @JsonProperty("nlu")
    public abstract JsonNode nlu();

    @JsonProperty("session_id")
    public abstract String sessionId();

    @JsonProperty("utterance_id")
    public abstract String utteranceId();
}
