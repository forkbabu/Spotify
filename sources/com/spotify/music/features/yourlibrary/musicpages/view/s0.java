package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

public final class s0 implements fjf<r0> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<x0> c;
    private final wlf<zc9> d;

    public s0(wlf<Context> wlf, wlf<c> wlf2, wlf<x0> wlf3, wlf<zc9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
