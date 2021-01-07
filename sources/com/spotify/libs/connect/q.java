package com.spotify.libs.connect;

import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.l;
import io.reactivex.y;

public final class q implements fjf<p> {
    private final wlf<c> a;
    private final wlf<l> b;
    private final wlf<y> c;

    public q(wlf<c> wlf, wlf<l> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get());
    }
}
