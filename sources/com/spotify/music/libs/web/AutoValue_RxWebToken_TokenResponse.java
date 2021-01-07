package com.spotify.music.libs.web;

import com.spotify.music.libs.web.RxWebToken;

final class AutoValue_RxWebToken_TokenResponse extends RxWebToken.TokenResponse {
    private final String token;

    AutoValue_RxWebToken_TokenResponse(String str) {
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
        if (obj instanceof RxWebToken.TokenResponse) {
            return this.token.equals(((RxWebToken.TokenResponse) obj).token());
        }
        return false;
    }

    public int hashCode() {
        return this.token.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("TokenResponse{token="), this.token, "}");
    }

    @Override // com.spotify.music.libs.web.RxWebToken.TokenResponse
    public String token() {
        return this.token;
    }
}
