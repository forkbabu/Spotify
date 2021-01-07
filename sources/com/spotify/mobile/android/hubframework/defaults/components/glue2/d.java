package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.b;

public final class d implements fjf<b.c> {
    private final wlf<cqe> a;

    public d(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b.c(this.a.get());
    }
}
