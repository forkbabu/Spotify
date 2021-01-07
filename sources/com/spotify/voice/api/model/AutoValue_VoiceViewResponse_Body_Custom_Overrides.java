package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Body_Custom_Overrides extends VoiceViewResponse.Body.Custom.Overrides {
    private final String name;
    private final String uri;

    AutoValue_VoiceViewResponse_Body_Custom_Overrides(String str, String str2) {
        this.name = str;
        if (str2 != null) {
            this.uri = str2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body.Custom.Overrides)) {
            return false;
        }
        VoiceViewResponse.Body.Custom.Overrides overrides = (VoiceViewResponse.Body.Custom.Overrides) obj;
        String str = this.name;
        if (str != null ? str.equals(overrides.name()) : overrides.name() == null) {
            if (this.uri.equals(overrides.uri())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Custom.Overrides
    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Overrides{name=");
        V0.append(this.name);
        V0.append(", uri=");
        return je.I0(V0, this.uri, "}");
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Custom.Overrides
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
