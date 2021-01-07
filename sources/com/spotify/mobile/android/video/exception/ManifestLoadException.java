package com.spotify.mobile.android.video.exception;

public class ManifestLoadException extends BetamaxException {
    private static final long serialVersionUID = 6484364596919693595L;

    public ManifestLoadException(String str, ErrorType errorType, Throwable th) {
        super(str, errorType, th);
    }
}
