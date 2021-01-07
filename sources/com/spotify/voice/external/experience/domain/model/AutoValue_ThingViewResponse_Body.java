package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;

final class AutoValue_ThingViewResponse_Body extends ThingViewResponse.Body {
    private final ThingViewResponse.Body.Target target;

    AutoValue_ThingViewResponse_Body(ThingViewResponse.Body.Target target2) {
        this.target = target2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse.Body)) {
            return false;
        }
        ThingViewResponse.Body.Target target2 = this.target;
        ThingViewResponse.Body.Target target3 = ((ThingViewResponse.Body) obj).target();
        if (target2 != null) {
            return target2.equals(target3);
        }
        if (target3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        ThingViewResponse.Body.Target target2 = this.target;
        return (target2 == null ? 0 : target2.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Body
    @JsonProperty("target")
    public ThingViewResponse.Body.Target target() {
        return this.target;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Body{target=");
        V0.append(this.target);
        V0.append("}");
        return V0.toString();
    }
}
