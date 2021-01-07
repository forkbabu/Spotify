package com.spotify.podcast.endpoints.exceptions;

public class UnableToParseMessageException extends Exception {
    private static final long serialVersionUID = 849832634988154184L;

    public UnableToParseMessageException(String str) {
        super(String.format("Unable to parse message returned from uri: %s", str));
    }
}
