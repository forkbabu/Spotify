package com.spotify.music.homecomponents.promotionv2;

import com.spotify.music.libs.viewuri.c;

public final class j implements fjf<HomePromotionPlayButtonLogger> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<c> c;
    private final wlf<cqe> d;
    private final wlf<ere> e;
    private final wlf<j81> f;

    public j(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<ere> wlf5, wlf<j81> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static j a(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<ere> wlf5, wlf<j81> wlf6) {
        return new j(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomePromotionPlayButtonLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
