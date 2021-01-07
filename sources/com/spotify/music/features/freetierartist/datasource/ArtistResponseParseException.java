package com.spotify.music.features.freetierartist.datasource;

public class ArtistResponseParseException extends RuntimeException {
    private static final long serialVersionUID = -8651212799202824257L;

    public ArtistResponseParseException() {
        super("Failed to parse response body");
    }
}
