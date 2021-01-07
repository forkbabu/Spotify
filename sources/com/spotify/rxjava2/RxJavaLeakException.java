package com.spotify.rxjava2;

public class RxJavaLeakException extends Exception {
    private static final long serialVersionUID = 3165935244719997686L;

    public RxJavaLeakException(String str) {
        super(String.format("Leaked subscription of %s.", str));
    }
}
