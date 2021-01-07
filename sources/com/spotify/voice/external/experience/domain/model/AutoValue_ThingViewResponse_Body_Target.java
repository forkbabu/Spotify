package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;

final class AutoValue_ThingViewResponse_Body_Target extends ThingViewResponse.Body.Target {
    private final String uri;

    AutoValue_ThingViewResponse_Body_Target(String str) {
        this.uri = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse.Body.Target)) {
            return false;
        }
        String str = this.uri;
        String uri2 = ((ThingViewResponse.Body.Target) obj).uri();
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

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Body.Target
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
