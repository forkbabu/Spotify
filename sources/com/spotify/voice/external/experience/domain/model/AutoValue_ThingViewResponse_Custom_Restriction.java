package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;

final class AutoValue_ThingViewResponse_Custom_Restriction extends ThingViewResponse.Custom.Restriction {
    private final String detail;
    private final String heading;

    AutoValue_ThingViewResponse_Custom_Restriction(String str, String str2) {
        if (str != null) {
            this.heading = str;
            if (str2 != null) {
                this.detail = str2;
                return;
            }
            throw new NullPointerException("Null detail");
        }
        throw new NullPointerException("Null heading");
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom.Restriction
    @JsonProperty("detail")
    public String detail() {
        return this.detail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse.Custom.Restriction)) {
            return false;
        }
        ThingViewResponse.Custom.Restriction restriction = (ThingViewResponse.Custom.Restriction) obj;
        if (!this.heading.equals(restriction.heading()) || !this.detail.equals(restriction.detail())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.heading.hashCode() ^ 1000003) * 1000003) ^ this.detail.hashCode();
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom.Restriction
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
