package com.spotify.mobile.android.video.exception;

public class PlaybackException extends BetamaxException {
    private static final long serialVersionUID = -5972487645393480953L;

    public PlaybackException(String str, ErrorType errorType) {
        super(str, errorType);
    }

    public PlaybackException(String str, ErrorType errorType, Throwable th) {
        super(str, errorType, th);
    }
}
