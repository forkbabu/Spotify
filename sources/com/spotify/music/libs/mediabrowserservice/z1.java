package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.connection.l;
import io.reactivex.y;

public final class z1 implements fjf<y1> {
    private final wlf<l> a;
    private final wlf<o2> b;
    private final wlf<y> c;

    public z1(wlf<l> wlf, wlf<o2> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y1(this.a, this.b, this.c);
    }
}
