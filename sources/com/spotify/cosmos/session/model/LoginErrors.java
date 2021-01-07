package com.spotify.cosmos.session.model;

public interface LoginErrors {
    public static final int CODE_AUTH_ABORTED = 5;
    public static final int CODE_AUTH_BAD_CREDENTIALS = 2;
    public static final int CODE_AUTH_BOOTSTRAP_COMPLETED = 14;
    public static final int CODE_AUTH_BOOTSTRAP_FAILED = 15;
    public static final int CODE_AUTH_CHALLENGE_NOT_FOUND = 8;
    public static final int CODE_AUTH_ILLEGAL_STATE = 9;
    public static final int CODE_AUTH_INVALID_IDENTIFIER = 4;
    public static final int CODE_AUTH_INVALID_USER_ID = 11;
    public static final int CODE_AUTH_MULTIPLE_LOGIN_NOT_ALLOWED = 1;
    public static final int CODE_AUTH_NETWORK = 16;
    public static final int CODE_AUTH_NOT_LOGGED_IN = 6;
    public static final int CODE_AUTH_PRE_AUTHENTICATION_FAILED = 3;
    public static final int CODE_AUTH_REUSABLE_CREDENTIALS_NOT_FOUND = 13;
    public static final int CODE_AUTH_TOO_MANY_ATTEMPTS = 10;
    public static final int CODE_AUTH_TRY_AGAIN_LATER = 7;
    public static final int LEGACY_ERROR_AP_NETWORK_DISABLED = 39;
    public static final int LEGACY_ERROR_AP_PROTOCOL = 29;
    public static final int LEGACY_ERROR_AP_SOCKET = 37;
    public static final int LEGACY_ERROR_DNS = 31;
    public static final int LEGACY_ERROR_INVALID_CREDENTIALS = 19;
    public static final int LEGACY_ERROR_LOGIN_ACCOUNT_EXISTS = 23;
    public static final int LEGACY_ERROR_LOGIN_USER_PASS = 38;
    public static final int LEGACY_ERROR_REGION_MISMATCH = 17;
}
