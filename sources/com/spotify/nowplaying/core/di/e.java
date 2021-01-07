package com.spotify.nowplaying.core.di;

import com.spotify.player.controls.d;
import com.spotify.player.stateful.q;
import kotlin.jvm.internal.h;

public final class e implements fjf<d> {
    private final wlf<q> a;

    public e(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q qVar = this.a.get();
        h.e(qVar, "statefulPlayerApis");
        d a2 = qVar.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
