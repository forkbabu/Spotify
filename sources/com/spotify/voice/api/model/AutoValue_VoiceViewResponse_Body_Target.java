package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Body_Target extends VoiceViewResponse.Body.Target {
    private final String uri;

    AutoValue_VoiceViewResponse_Body_Target(String str) {
        this.uri = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body.Target)) {
            return false;
        }
        String str = this.uri;
        String uri2 = ((VoiceViewResponse.Body.Target) obj).uri();
        if (str != null) {
            return str.equals(uri2);
        }
        if (uri2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.uri;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("Target{uri="), this.uri, "}");
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Target
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
