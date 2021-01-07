package com.spotify.music.appprotocol.superbird.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceAppProtocol_VoiceSessionError extends VoiceAppProtocol$VoiceSessionError {
    private final String cause;
    private final String domain;
    private final String type;

    AutoValue_VoiceAppProtocol_VoiceSessionError(String str, String str2, String str3) {
        if (str != null) {
            this.domain = str;
            if (str2 != null) {
                this.type = str2;
                if (str3 != null) {
                    this.cause = str3;
                    return;
                }
                throw new NullPointerException("Null cause");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null domain");
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceSessionError
    @JsonProperty("cause")
    public String cause() {
        return this.cause;
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceSessionError
    @JsonProperty("domain")
    public String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAppProtocol$VoiceSessionError)) {
            return false;
        }
        VoiceAppProtocol$VoiceSessionError voiceAppProtocol$VoiceSessionError = (VoiceAppProtocol$VoiceSessionError) obj;
        if (!this.domain.equals(voiceAppProtocol$VoiceSessionError.domain()) || !this.type.equals(voiceAppProtocol$VoiceSessionError.type()) || !this.cause.equals(voiceAppProtocol$VoiceSessionError.cause())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.domain.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.cause.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceSessionError{domain=");
        V0.append(this.domain);
        V0.append(", type=");
        V0.append(this.type);
        V0.append(", cause=");
        return je.I0(V0, this.cause, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceSessionError
    @JsonProperty("type")
    public String type() {
        return this.type;
    }
}
