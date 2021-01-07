package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = LoginRequestSerializer.class)
public abstract class LoginRequest {
    public static LoginRequest create(LoginCredentials loginCredentials) {
        return new AutoValue_LoginRequest(loginCredentials, null);
    }

    public abstract LoginCredentials credentials();

    public abstract LoginOptions options();

    public static LoginRequest create(LoginCredentials loginCredentials, LoginOptions loginOptions) {
        return new AutoValue_LoginRequest(loginCredentials, loginOptions);
    }
}
