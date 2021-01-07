package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.b;

public final class c implements fjf<b.C0179b> {
    private final wlf<cqe> a;

    public c(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b.C0179b(this.a.get());
    }
}
