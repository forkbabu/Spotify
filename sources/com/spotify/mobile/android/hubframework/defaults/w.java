package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.music.follow.m;

public final class w implements fjf<v> {
    private final wlf<ere> a;
    private final wlf<f71> b;
    private final wlf<m> c;
    private final wlf<j> d;
    private final wlf<h> e;
    private final wlf<t> f;
    private final wlf<String> g;

    public w(wlf<ere> wlf, wlf<f71> wlf2, wlf<m> wlf3, wlf<j> wlf4, wlf<h> wlf5, wlf<t> wlf6, wlf<String> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static w a(wlf<ere> wlf, wlf<f71> wlf2, wlf<m> wlf3, wlf<j> wlf4, wlf<h> wlf5, wlf<t> wlf6, wlf<String> wlf7) {
        return new w(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
