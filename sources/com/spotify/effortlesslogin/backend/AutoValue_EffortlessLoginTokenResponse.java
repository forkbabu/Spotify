package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_EffortlessLoginTokenResponse extends EffortlessLoginTokenResponse {
    private final String token;

    AutoValue_EffortlessLoginTokenResponse(String str) {
        if (str != null) {
            this.token = str;
            return;
        }
        throw new NullPointerException("Null token");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EffortlessLoginTokenResponse) {
            return this.token.equals(((EffortlessLoginTokenResponse) obj).token());
        }
        return false;
    }

    public int hashCode() {
        return this.token.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("EffortlessLoginTokenResponse{token="), this.token, "}");
    }

    @Override // com.spotify.effortlesslogin.backend.EffortlessLoginTokenResponse
    @JsonGetter("token")
    public String token() {
        return this.token;
    }
}
