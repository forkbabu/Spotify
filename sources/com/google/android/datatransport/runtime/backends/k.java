package com.google.android.datatransport.runtime.backends;

import android.content.Context;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<h> b;

    public k(wlf<Context> wlf, wlf<h> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
