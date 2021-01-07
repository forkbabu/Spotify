package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;

final class AutoValue_VoiceAppProtocol_VoiceData extends VoiceAppProtocol$VoiceData {
    private final String sessionId;
    private final ByteBuffer voiceData;

    AutoValue_VoiceAppProtocol_VoiceData(String str, ByteBuffer byteBuffer) {
        if (str != null) {
            this.sessionId = str;
            if (byteBuffer != null) {
                this.voiceData = byteBuffer;
                return;
            }
            throw new NullPointerException("Null voiceData");
        }
        throw new NullPointerException("Null sessionId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAppProtocol$VoiceData)) {
            return false;
        }
        VoiceAppProtocol$VoiceData voiceAppProtocol$VoiceData = (VoiceAppProtocol$VoiceData) obj;
        if (!this.sessionId.equals(voiceAppProtocol$VoiceData.sessionId()) || !this.voiceData.equals(voiceAppProtocol$VoiceData.voiceData())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.voiceData.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceData
    @JsonProperty("session_id")
    public String sessionId() {
        return this.sessionId;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceData{sessionId=");
        V0.append(this.sessionId);
        V0.append(", voiceData=");
        V0.append(this.voiceData);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceData
    @JsonProperty("voice_data")
    public ByteBuffer voiceData() {
        return this.voiceData;
    }
}
