package com.spotify.libs.otp.ui;

import com.spotify.glue.dialogs.g;

public final class d0 implements fjf<c0> {
    private final wlf<g> a;
    private final wlf<a0> b;

    public d0(wlf<g> wlf, wlf<a0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get());
    }
}
