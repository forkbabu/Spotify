package com.spotify.mobile.android.video.offline.exception;

public enum ErrorType {
    ERROR_UNKNOWN(0),
    ERROR_DISK_FULL(1),
    ERROR_NO_INTERNET_CONNECTION(2);
    
    private final int mErrorCode;

    private ErrorType(int i) {
        this.mErrorCode = i;
    }

    public int d() {
        return this.mErrorCode;
    }
}
