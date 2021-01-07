package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_VoiceAppProtocol_CancelSession extends VoiceAppProtocol$CancelSession {
    private final String sessionId;

    AutoValue_VoiceAppProtocol_CancelSession(String str) {
        if (str != null) {
            this.sessionId = str;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceAppProtocol$CancelSession) {
            return this.sessionId.equals(((VoiceAppProtocol$CancelSession) obj).sessionId());
        }
        return false;
    }

    public int hashCode() {
        return this.sessionId.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$CancelSession
    @JsonProperty("session_id")
    public String sessionId() {
        return this.sessionId;
    }

    public String toString() {
        return je.I0(je.V0("CancelSession{sessionId="), this.sessionId, "}");
    }
}
