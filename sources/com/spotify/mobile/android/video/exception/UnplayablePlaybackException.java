package com.spotify.mobile.android.video.exception;

public class UnplayablePlaybackException extends BetamaxException {
    private static final long serialVersionUID = -4504367364081598692L;

    public UnplayablePlaybackException(String str, ErrorType errorType) {
        super(str, errorType);
    }

    public UnplayablePlaybackException(String str, ErrorType errorType, Throwable th) {
        super(str, errorType, th);
    }
}
