package com.spotify.music.homecomponents.singleitem;

import com.spotify.music.libs.viewuri.c;

public final class g implements fjf<HomeSingleItemPlayButtonLogger> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<c> c;
    private final wlf<cqe> d;
    private final wlf<ere> e;

    public g(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<ere> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static g a(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<ere> wlf5) {
        return new g(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeSingleItemPlayButtonLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
