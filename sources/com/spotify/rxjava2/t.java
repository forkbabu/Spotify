package com.spotify.rxjava2;

public final class t<T> implements fjf<s<T>> {
    private final wlf<z<T>> a;

    public t(wlf<z<T>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
