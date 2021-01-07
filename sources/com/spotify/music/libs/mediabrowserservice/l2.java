package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.spotify.android.flags.c;
import io.reactivex.g;
import io.reactivex.y;

public final class l2 implements fjf<k2> {
    private final wlf<Context> a;
    private final wlf<g<c>> b;
    private final wlf<y> c;
    private final wlf<y> d;
    private final wlf<b3> e;

    public l2(wlf<Context> wlf, wlf<g<c>> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<b3> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k2(this.a, this.b, this.c, this.d, this.e);
    }
}
