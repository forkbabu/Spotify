package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;
import java.util.List;

final class AutoValue_VoiceViewResponse extends VoiceViewResponse {
    private final List<VoiceViewResponse.Body> body;
    private final VoiceViewResponse.Custom custom;

    AutoValue_VoiceViewResponse(VoiceViewResponse.Custom custom2, List<VoiceViewResponse.Body> list) {
        this.custom = custom2;
        this.body = list;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse
    @JsonProperty("body")
    public List<VoiceViewResponse.Body> body() {
        return this.body;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse
    @JsonProperty("custom")
    public VoiceViewResponse.Custom custom() {
        return this.custom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse)) {
            return false;
        }
        VoiceViewResponse voiceViewResponse = (VoiceViewResponse) obj;
        VoiceViewResponse.Custom custom2 = this.custom;
        if (custom2 != null ? custom2.equals(voiceViewResponse.custom()) : voiceViewResponse.custom() == null) {
            List<VoiceViewResponse.Body> list = this.body;
            if (list == null) {
                if (voiceViewResponse.body() == null) {
                    return true;
                }
            } else if (list.equals(voiceViewResponse.body())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        VoiceViewResponse.Custom custom2 = this.custom;
        int i = 0;
        int hashCode = ((custom2 == null ? 0 : custom2.hashCode()) ^ 1000003) * 1000003;
        List<VoiceViewResponse.Body> list = this.body;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceViewResponse{custom=");
        V0.append(this.custom);
        V0.append(", body=");
        return je.L0(V0, this.body, "}");
    }
}
