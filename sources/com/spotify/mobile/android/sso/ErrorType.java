package com.spotify.mobile.android.sso;

public enum ErrorType {
    RECOVERABLE(1),
    UNRECOVERABLE(2),
    INVALID_REQUEST(3);
    
    private final int mType;

    private ErrorType(int i) {
        this.mType = i;
    }

    public int d() {
        return this.mType;
    }
}
