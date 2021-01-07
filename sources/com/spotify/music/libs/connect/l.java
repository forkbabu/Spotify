package com.spotify.music.libs.connect;

import com.spotify.libs.connect.g;
import com.spotify.music.libs.connect.access.o;

public final class l implements fjf<k> {
    private final wlf<g> a;
    private final wlf<k4d> b;
    private final wlf<o> c;

    public l(wlf<g> wlf, wlf<k4d> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a, this.b, this.c);
    }
}
