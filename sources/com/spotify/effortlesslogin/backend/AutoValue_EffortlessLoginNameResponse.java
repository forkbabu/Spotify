package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_EffortlessLoginNameResponse extends EffortlessLoginNameResponse {
    private final String fullName;

    AutoValue_EffortlessLoginNameResponse(String str) {
        if (str != null) {
            this.fullName = str;
            return;
        }
        throw new NullPointerException("Null fullName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EffortlessLoginNameResponse) {
            return this.fullName.equals(((EffortlessLoginNameResponse) obj).fullName());
        }
        return false;
    }

    @Override // com.spotify.effortlesslogin.backend.EffortlessLoginNameResponse
    @JsonGetter("full_name")
    public String fullName() {
        return this.fullName;
    }

    public int hashCode() {
        return this.fullName.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("EffortlessLoginNameResponse{fullName="), this.fullName, "}");
    }
}
