package com.spotify.pushnotifications;

import android.content.Context;

public final class m implements fjf<l> {
    private final wlf<yzd> a;
    private final wlf<Context> b;
    private final wlf<n> c;

    public m(wlf<yzd> wlf, wlf<Context> wlf2, wlf<n> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get());
    }
}
