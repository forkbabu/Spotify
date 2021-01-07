package com.spotify.cosmos.session.model;

/* access modifiers changed from: package-private */
public final class AutoValue_LoginRequest extends LoginRequest {
    private final LoginCredentials credentials;
    private final LoginOptions options;

    AutoValue_LoginRequest(LoginCredentials loginCredentials, LoginOptions loginOptions) {
        if (loginCredentials != null) {
            this.credentials = loginCredentials;
            this.options = loginOptions;
            return;
        }
        throw new NullPointerException("Null credentials");
    }

    @Override // com.spotify.cosmos.session.model.LoginRequest
    public LoginCredentials credentials() {
        return this.credentials;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) obj;
        if (this.credentials.equals(loginRequest.credentials())) {
            LoginOptions loginOptions = this.options;
            if (loginOptions == null) {
                if (loginRequest.options() == null) {
                    return true;
                }
            } else if (loginOptions.equals(loginRequest.options())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.credentials.hashCode() ^ 1000003) * 1000003;
        LoginOptions loginOptions = this.options;
        return hashCode ^ (loginOptions == null ? 0 : loginOptions.hashCode());
    }

    @Override // com.spotify.cosmos.session.model.LoginRequest
    public LoginOptions options() {
        return this.options;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoginRequest{credentials=");
        V0.append(this.credentials);
        V0.append(", options=");
        V0.append(this.options);
        V0.append("}");
        return V0.toString();
    }
}
