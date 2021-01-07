package com.spotify.music.features.settings;

import android.content.Context;
import com.spotify.music.features.settings.adapter.p2;
import com.spotify.music.features.settings.adapter.u2;

public final class d1 implements fjf<u2> {
    private final wlf<Context> a;
    private final wlf<p2> b;

    public d1(wlf<Context> wlf, wlf<p2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        p2 p2Var = this.b.get();
        z0 z0Var = new z0(this.a.get(), p2Var, p2Var);
        z0Var.b(p2Var.p());
        return z0Var;
    }
}
