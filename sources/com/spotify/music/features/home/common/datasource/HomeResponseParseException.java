package com.spotify.music.features.home.common.datasource;

public class HomeResponseParseException extends RuntimeException {
    private static final long serialVersionUID = -8651212799202824257L;

    public HomeResponseParseException() {
        super("Failed to parse response body");
    }
}
