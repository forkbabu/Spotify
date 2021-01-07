package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.rxjava2.q;
import io.reactivex.y;

public final class g implements fjf<f> {
    private final wlf<Boolean> a;
    private final wlf<h> b;
    private final wlf<sxd> c;
    private final wlf<y> d;
    private final wlf<y> e;
    private final wlf<q> f;

    public g(wlf<Boolean> wlf, wlf<h> wlf2, wlf<sxd> wlf3, wlf<y> wlf4, wlf<y> wlf5, wlf<q> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static g a(wlf<Boolean> wlf, wlf<h> wlf2, wlf<sxd> wlf3, wlf<y> wlf4, wlf<y> wlf5, wlf<q> wlf6) {
        return new g(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
