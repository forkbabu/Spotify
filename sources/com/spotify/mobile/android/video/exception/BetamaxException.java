package com.spotify.mobile.android.video.exception;

public abstract class BetamaxException extends Exception {
    private static final long serialVersionUID = 5344939152774269431L;
    private final ErrorType mErrorType;

    public BetamaxException(String str, ErrorType errorType) {
        super(str, null);
        this.mErrorType = errorType;
    }

    public ErrorType a() {
        return this.mErrorType;
    }

    public BetamaxException(String str, ErrorType errorType, Throwable th) {
        super(str, th);
        this.mErrorType = errorType;
    }
}
