package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.remoteconfig.l8;

public final class p implements fjf<l8> {
    private final wlf<l0e> a;

    public p(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l8 l8Var = (l8) this.a.get().a(b.a);
        yif.g(l8Var, "Cannot return null from a non-@Nullable @Provides method");
        return l8Var;
    }
}
