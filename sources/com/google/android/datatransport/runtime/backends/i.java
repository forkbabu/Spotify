package com.google.android.datatransport.runtime.backends;

import android.content.Context;

public final class i implements fjf<h> {
    private final wlf<Context> a;
    private final wlf<ti> b;
    private final wlf<ti> c;

    public i(wlf<Context> wlf, wlf<ti> wlf2, wlf<ti> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
