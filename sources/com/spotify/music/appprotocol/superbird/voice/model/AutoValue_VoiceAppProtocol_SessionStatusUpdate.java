package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voice.api.model.AsrResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceAppProtocol_SessionStatusUpdate extends VoiceAppProtocol$SessionStatusUpdate {
    private final AsrResponse asr;
    private final VoiceAppProtocol$VoiceSessionError error;
    private final String message;
    private final JsonNode nlu;
    private final String sessionId;
    private final String utteranceId;

    AutoValue_VoiceAppProtocol_SessionStatusUpdate(String str, String str2, String str3, VoiceAppProtocol$VoiceSessionError voiceAppProtocol$VoiceSessionError, AsrResponse asrResponse, JsonNode jsonNode) {
        if (str != null) {
            this.sessionId = str;
            if (str2 != null) {
                this.utteranceId = str2;
                this.message = str3;
                this.error = voiceAppProtocol$VoiceSessionError;
                this.asr = asrResponse;
                this.nlu = jsonNode;
                return;
            }
            throw new NullPointerException("Null utteranceId");
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty("asr")
    public AsrResponse asr() {
        return this.asr;
    }

    public boolean equals(Object obj) {
        String str;
        VoiceAppProtocol$VoiceSessionError voiceAppProtocol$VoiceSessionError;
        AsrResponse asrResponse;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAppProtocol$SessionStatusUpdate)) {
            return false;
        }
        VoiceAppProtocol$SessionStatusUpdate voiceAppProtocol$SessionStatusUpdate = (VoiceAppProtocol$SessionStatusUpdate) obj;
        if (this.sessionId.equals(voiceAppProtocol$SessionStatusUpdate.sessionId()) && this.utteranceId.equals(voiceAppProtocol$SessionStatusUpdate.utteranceId()) && ((str = this.message) != null ? str.equals(voiceAppProtocol$SessionStatusUpdate.message()) : voiceAppProtocol$SessionStatusUpdate.message() == null) && ((voiceAppProtocol$VoiceSessionError = this.error) != null ? voiceAppProtocol$VoiceSessionError.equals(voiceAppProtocol$SessionStatusUpdate.error()) : voiceAppProtocol$SessionStatusUpdate.error() == null) && ((asrResponse = this.asr) != null ? asrResponse.equals(voiceAppProtocol$SessionStatusUpdate.asr()) : voiceAppProtocol$SessionStatusUpdate.asr() == null)) {
            JsonNode jsonNode = this.nlu;
            if (jsonNode == null) {
                if (voiceAppProtocol$SessionStatusUpdate.nlu() == null) {
                    return true;
                }
            } else if (jsonNode.equals(voiceAppProtocol$SessionStatusUpdate.nlu())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public VoiceAppProtocol$VoiceSessionError error() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = (((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.utteranceId.hashCode()) * 1000003;
        String str = this.message;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        VoiceAppProtocol$VoiceSessionError voiceAppProtocol$VoiceSessionError = this.error;
        int hashCode3 = (hashCode2 ^ (voiceAppProtocol$VoiceSessionError == null ? 0 : voiceAppProtocol$VoiceSessionError.hashCode())) * 1000003;
        AsrResponse asrResponse = this.asr;
        int hashCode4 = (hashCode3 ^ (asrResponse == null ? 0 : asrResponse.hashCode())) * 1000003;
        JsonNode jsonNode = this.nlu;
        if (jsonNode != null) {
            i = jsonNode.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty("message")
    public String message() {
        return this.message;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty("nlu")
    public JsonNode nlu() {
        return this.nlu;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty("session_id")
    public String sessionId() {
        return this.sessionId;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SessionStatusUpdate{sessionId=");
        V0.append(this.sessionId);
        V0.append(", utteranceId=");
        V0.append(this.utteranceId);
        V0.append(", message=");
        V0.append(this.message);
        V0.append(", error=");
        V0.append(this.error);
        V0.append(", asr=");
        V0.append(this.asr);
        V0.append(", nlu=");
        V0.append(this.nlu);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate
    @JsonProperty("utterance_id")
    public String utteranceId() {
        return this.utteranceId;
    }
}
