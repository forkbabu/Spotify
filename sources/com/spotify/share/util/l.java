package com.spotify.share.util;

import android.content.Context;
import com.spotify.mobile.android.util.t;

public final class l implements fjf<k> {
    private final wlf<Context> a;
    private final wlf<t> b;

    public l(wlf<Context> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
