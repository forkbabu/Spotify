package com.spotify.cosmos.android;

public final class ResolverException extends Exception {
    private static final long serialVersionUID = -7958249303774126846L;

    public ResolverException(String str) {
        super(str);
    }

    public ResolverException(Throwable th) {
        super(th);
    }
}
