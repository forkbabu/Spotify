package com.spotify.music.builtinauth.authenticator;

public class BuiltInAuthException extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = 0;
    private final String mDescription;
    private final AuthError mError;

    public enum AuthError {
        ERROR_USER_NEEDS_AUTHORIZATION,
        ERROR_NOT_LOGGED_IN,
        ERROR_OFFLINE_MODE_ACTIVE,
        ERROR_AUTHORIZATION_TIMEOUT,
        ERROR_AUTHORIZATION_RESPONSE
    }

    public BuiltInAuthException(AuthError authError, String str) {
        this.mError = authError;
        this.mDescription = str;
    }

    public String a() {
        return this.mDescription;
    }

    public AuthError b() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format("%s: %s", this.mError.name(), this.mDescription);
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return String.format("BuiltInAuthException{%s:%s}", this.mError, this.mDescription);
    }
}
