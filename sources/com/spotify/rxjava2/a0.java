package com.spotify.rxjava2;

import com.spotify.remoteconfig.ma;

public final class a0<T> implements fjf<z<T>> {
    private final wlf<ma> a;

    public a0(wlf<ma> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get());
    }
}
