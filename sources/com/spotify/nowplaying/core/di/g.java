package com.spotify.nowplaying.core.di;

import com.spotify.player.options.d;
import com.spotify.player.stateful.q;
import kotlin.jvm.internal.h;

public final class g implements fjf<d> {
    private final wlf<q> a;

    public g(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q qVar = this.a.get();
        h.e(qVar, "statefulPlayerApis");
        d b = qVar.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
