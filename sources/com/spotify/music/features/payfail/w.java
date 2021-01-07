package com.spotify.music.features.payfail;

import android.content.Context;
import com.spotify.mobile.android.util.t;

public final class w implements fjf<v> {
    private final wlf<Context> a;
    private final wlf<t> b;
    private final wlf<y> c;
    private final wlf<com.spotify.mobile.android.rx.w> d;
    private final wlf<yn1> e;

    public w(wlf<Context> wlf, wlf<t> wlf2, wlf<y> wlf3, wlf<com.spotify.mobile.android.rx.w> wlf4, wlf<yn1> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a, this.b, this.c, this.d, this.e);
    }
}
