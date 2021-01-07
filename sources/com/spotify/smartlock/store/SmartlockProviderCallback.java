package com.spotify.smartlock.store;

import com.google.android.gms.auth.api.credentials.Credential;

public interface SmartlockProviderCallback {

    public enum CredentialType {
        SINGLE,
        REQUIRED_RESOLUTION,
        EMAIL_HINT
    }

    void c();

    void e();

    void f(Credential credential, CredentialType credentialType);
}
