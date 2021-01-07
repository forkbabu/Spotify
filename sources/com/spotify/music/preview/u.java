package com.spotify.music.preview;

import android.content.Context;
import io.reactivex.y;

public final class u implements fjf<q> {
    private final wlf<Context> a;
    private final wlf<v> b;
    private final wlf<cqe> c;
    private final wlf<y> d;

    public u(wlf<Context> wlf, wlf<v> wlf2, wlf<cqe> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
