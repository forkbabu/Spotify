package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;
import java.util.List;

final class AutoValue_ThingViewResponse extends ThingViewResponse {
    private final List<ThingViewResponse.Body> body;
    private final ThingViewResponse.Custom custom;

    AutoValue_ThingViewResponse(ThingViewResponse.Custom custom2, List<ThingViewResponse.Body> list) {
        this.custom = custom2;
        this.body = list;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse
    @JsonProperty("body")
    public List<ThingViewResponse.Body> body() {
        return this.body;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse
    @JsonProperty("custom")
    public ThingViewResponse.Custom custom() {
        return this.custom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse)) {
            return false;
        }
        ThingViewResponse thingViewResponse = (ThingViewResponse) obj;
        ThingViewResponse.Custom custom2 = this.custom;
        if (custom2 != null ? custom2.equals(thingViewResponse.custom()) : thingViewResponse.custom() == null) {
            List<ThingViewResponse.Body> list = this.body;
            if (list == null) {
                if (thingViewResponse.body() == null) {
                    return true;
                }
            } else if (list.equals(thingViewResponse.body())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ThingViewResponse.Custom custom2 = this.custom;
        int i = 0;
        int hashCode = ((custom2 == null ? 0 : custom2.hashCode()) ^ 1000003) * 1000003;
        List<ThingViewResponse.Body> list = this.body;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ThingViewResponse{custom=");
        V0.append(this.custom);
        V0.append(", body=");
        return je.L0(V0, this.body, "}");
    }
}
