package com.spotify.libs.connect.volume.controllers;

import android.content.Context;

public final class j implements fjf<i> {
    private final wlf<Context> a;
    private final wlf<n> b;
    private final wlf<gv0> c;

    public j(wlf<Context> wlf, wlf<n> wlf2, wlf<gv0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
