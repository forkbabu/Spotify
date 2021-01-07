package com.spotify.music.features.connect.cast;

import android.content.Context;
import com.spotify.libs.connect.providers.h;
import io.reactivex.y;

public final class s implements fjf<r> {
    private final wlf<Context> a;
    private final wlf<l> b;
    private final wlf<h> c;
    private final wlf<ss0> d;
    private final wlf<y> e;

    public s(wlf<Context> wlf, wlf<l> wlf2, wlf<h> wlf3, wlf<ss0> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
