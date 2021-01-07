package com.spotify.music.playlist.extender;

import io.reactivex.y;

public final class a0 implements fjf<z> {
    private final wlf<s0> a;
    private final wlf<String> b;
    private final wlf<d8a> c;
    private final wlf<y> d;
    private final wlf<Integer> e;

    public a0(wlf<s0> wlf, wlf<String> wlf2, wlf<d8a> wlf3, wlf<y> wlf4, wlf<Integer> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a, this.b, this.c, this.d, this.e);
    }
}
