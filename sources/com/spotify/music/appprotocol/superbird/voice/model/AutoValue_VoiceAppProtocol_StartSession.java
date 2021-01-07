package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_VoiceAppProtocol_StartSession extends VoiceAppProtocol$StartSession {
    private final String audioMimeType;
    private final String sessionId;

    AutoValue_VoiceAppProtocol_StartSession(String str, String str2) {
        if (str != null) {
            this.sessionId = str;
            if (str2 != null) {
                this.audioMimeType = str2;
                return;
            }
            throw new NullPointerException("Null audioMimeType");
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$StartSession
    @JsonProperty("audio_mime_type")
    public String audioMimeType() {
        return this.audioMimeType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAppProtocol$StartSession)) {
            return false;
        }
        VoiceAppProtocol$StartSession voiceAppProtocol$StartSession = (VoiceAppProtocol$StartSession) obj;
        if (!this.sessionId.equals(voiceAppProtocol$StartSession.sessionId()) || !this.audioMimeType.equals(voiceAppProtocol$StartSession.audioMimeType())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.audioMimeType.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$StartSession
    @JsonProperty("session_id")
    public String sessionId() {
        return this.sessionId;
    }

    public String toString() {
        StringBuilder V0 = je.V0("StartSession{sessionId=");
        V0.append(this.sessionId);
        V0.append(", audioMimeType=");
        return je.I0(V0, this.audioMimeType, "}");
    }
}
