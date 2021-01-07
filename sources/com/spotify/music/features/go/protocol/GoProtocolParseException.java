package com.spotify.music.features.go.protocol;

public class GoProtocolParseException extends Exception {
    private static final long serialVersionUID = -3085653648567961445L;

    public GoProtocolParseException() {
        super("Could not parse bytes to a meaningful command.");
    }
}
