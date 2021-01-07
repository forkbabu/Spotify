package com.spotify.android.glue.patterns.toolbarmenu;

import defpackage.t8a;

public final class f0 implements fjf<e0> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<t8a.a> c;

    public f0(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<t8a.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0(this.a.get(), this.b.get(), this.c.get());
    }
}
