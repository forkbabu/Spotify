package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Custom_Restriction extends VoiceViewResponse.Custom.Restriction {
    private final String detail;
    private final String heading;

    AutoValue_VoiceViewResponse_Custom_Restriction(String str, String str2) {
        if (str != null) {
            this.heading = str;
            this.detail = str2;
            return;
        }
        throw new NullPointerException("Null heading");
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom.Restriction
    @JsonProperty("detail")
    public String detail() {
        return this.detail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Custom.Restriction)) {
            return false;
        }
        VoiceViewResponse.Custom.Restriction restriction = (VoiceViewResponse.Custom.Restriction) obj;
        if (this.heading.equals(restriction.heading())) {
            String str = this.detail;
            if (str == null) {
                if (restriction.detail() == null) {
                    return true;
                }
            } else if (str.equals(restriction.detail())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.heading.hashCode() ^ 1000003) * 1000003;
        String str = this.detail;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom.Restriction
    @JsonProperty("heading")
    public String heading() {
        return this.heading;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Restriction{heading=");
        V0.append(this.heading);
        V0.append(", detail=");
        return je.I0(V0, this.detail, "}");
    }
}
