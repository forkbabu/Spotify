package com.spotify.music.genie;

public class GenieException extends Exception {
    private static final long serialVersionUID = -553526064128713233L;

    public GenieException(Throwable th) {
        super(th);
    }
}
