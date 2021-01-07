package com.spotify.music.builtinauth.cache;

import io.reactivex.y;

public final class n0 implements fjf<m0> {
    private final wlf<AuthCacheRoomDatabase> a;
    private final wlf<j0> b;
    private final wlf<y> c;

    public n0(wlf<AuthCacheRoomDatabase> wlf, wlf<j0> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m0(this.a.get(), this.b.get(), this.c.get());
    }
}
