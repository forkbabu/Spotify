package com.spotify.android.flags;

public class UnmappableValueException extends Exception {
    private static final long serialVersionUID = 4006225106797912781L;

    public UnmappableValueException(b<?> bVar, String str, Throwable th) {
        super(bVar.d() + " of type " + bVar.f().getName() + " cannot map value \"" + str + '\"', th);
    }
}
