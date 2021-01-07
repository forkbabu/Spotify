package com.spotify.music.spotlets.scannables;

public class ScannablesException extends Exception {
    private static final long serialVersionUID = -792552678912326846L;
    private final int mErrorCode;

    public ScannablesException(int i) {
        this.mErrorCode = i;
    }
}
