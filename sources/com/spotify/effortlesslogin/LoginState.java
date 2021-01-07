package com.spotify.effortlesslogin;

public abstract class LoginState {

    public enum Type {
        LOGGED_IN,
        LOGGING_IN,
        LOGIN_FAILED
    }

    public abstract String a();

    public abstract Type b();
}
