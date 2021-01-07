package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;
import java.util.Set;

public final class y1 implements fjf<x1> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<Set<nd1>> c;
    private final wlf<w> d;
    private final wlf<g<SessionState>> e;
    private final wlf<pk1> f;

    public y1(wlf<y> wlf, wlf<y> wlf2, wlf<Set<nd1>> wlf3, wlf<w> wlf4, wlf<g<SessionState>> wlf5, wlf<pk1> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
