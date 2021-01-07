package com.spotify.voice.results.model;

public class NoResultsPageException extends Exception {
    private static final long serialVersionUID = -690949776828982861L;

    public NoResultsPageException(Throwable th) {
        super(th);
    }
}
