package com.spotify.mobile.android.coreintegration;

import android.content.Context;
import com.spotify.libs.connect.providers.t;
import com.spotify.mobile.android.service.o;
import io.reactivex.y;

public final class b0 implements fjf<a0> {
    private final wlf<Context> a;
    private final wlf<t> b;
    private final wlf<y> c;
    private final wlf<h2e> d;
    private final wlf<o> e;

    public b0(wlf<Context> wlf, wlf<t> wlf2, wlf<y> wlf3, wlf<h2e> wlf4, wlf<o> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
