package com.spotify.mobile.android.video.offline.exception;

public class BetamaxDownloadException extends Exception {
    private static final long serialVersionUID = 1028363797215248376L;
    private final ErrorType mErrorType;

    public BetamaxDownloadException(String str, ErrorType errorType) {
        super(str);
        this.mErrorType = errorType;
    }

    public ErrorType a() {
        return this.mErrorType;
    }
}
