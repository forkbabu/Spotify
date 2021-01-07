package com.spotify.common.uri;

public class SpotifyUriParserException extends RuntimeException {
    public SpotifyUriParserException() {
    }

    public SpotifyUriParserException(String str) {
        super(str);
    }
}
