package com.spotify.mobile.android.service.feature;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import io.reactivex.g;

public final class p implements fjf<g<c>> {
    private final wlf<v> a;

    public p(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<c> b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
