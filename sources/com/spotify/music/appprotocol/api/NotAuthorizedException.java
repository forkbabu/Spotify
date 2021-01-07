package com.spotify.music.appprotocol.api;

public class NotAuthorizedException extends RuntimeException {
    private static final long serialVersionUID = 0;
    private final int mActual;
    private final int mExpected;

    public NotAuthorizedException(int i, int i2) {
        this.mExpected = i;
        this.mActual = i2;
    }
}
