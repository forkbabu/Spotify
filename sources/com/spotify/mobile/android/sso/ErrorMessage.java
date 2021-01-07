package com.spotify.mobile.android.sso;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
public enum ErrorMessage {
    INVALID_VERSION_ERROR("INVALID_VERSION", r1),
    INVALID_PARAMETERS_ERROR("INVALID_REQUEST", r1),
    NO_INTERNET_CONNECTION("NO_INTERNET_CONNECTION", r7),
    OFFLINE_MODE_ACTIVE("OFFLINE_MODE_ACTIVE", r10),
    CONNECTION_TIMEOUT("CONNECTION_TIMEOUT", r10),
    BAKERY_REQUEST_ERROR("INTERNAL_ERROR", r10),
    WEBVIEW_ERROR("WEBVIEW_ERROR", r10),
    ACCOUNTS_SERVICE_ERROR("AUTHENTICATION_SERVICE_UNAVAILABLE", r7),
    UNKNOWN_RESPONSE_TYPE_ERROR("INVALID_RESPONSE", r1),
    CLIENT_VERIFICATION_ERROR("CLIENT_VERIFICATION_FAILED", r1),
    ACCOUNTS_INVALID_CLIENT("INVALID_CLIENT", r1),
    ACCOUNTS_INVALID_APP_ID("INVALID_APP_ID", r1),
    ACCOUNTS_INVALID_REQUEST("INVALID_REQUEST", r1),
    ACCOUNTS_UNKNOWN_ERROR("AUTHENTICATION_SERVICE_UNKNOWN_ERROR", r7),
    ACCOUNTS_USER_DENIED("AUTHENTICATION_DENIED_BY_USER", r7),
    CANCELLED("CANCELLED", r7),
    NEEDS_AUTHORIZATION_ERROR("USER_AUTHORIZATION_REQUIRED", r7);
    
    private final ErrorType mErrorType;
    private final String mMessage;

    static {
        ErrorType errorType = ErrorType.INVALID_REQUEST;
        ErrorType errorType2 = ErrorType.UNRECOVERABLE;
        ErrorType errorType3 = ErrorType.RECOVERABLE;
    }

    private ErrorMessage(String str, ErrorType errorType) {
        this.mMessage = str;
        this.mErrorType = errorType;
    }

    public String d() {
        return this.mMessage;
    }

    public ErrorType g() {
        return this.mErrorType;
    }
}
