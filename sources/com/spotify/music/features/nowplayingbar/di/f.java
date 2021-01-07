package com.spotify.music.features.nowplayingbar.di;

import com.spotify.music.features.nowplayingbar.view.q0;
import com.spotify.remoteconfig.e6;
import kotlin.jvm.internal.h;

public final class f implements fjf<q0> {
    private final wlf<e6> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;

    public f(wlf<e6> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        e6 e6Var = this.a.get();
        boolean booleanValue = this.b.get().booleanValue();
        boolean booleanValue2 = this.c.get().booleanValue();
        h.e(e6Var, "npbProperties");
        return new q0(e6Var.b(), booleanValue, booleanValue2, e6Var.a());
    }
}
