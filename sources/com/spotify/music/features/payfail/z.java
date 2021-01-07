package com.spotify.music.features.payfail;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.y;

public final class z implements fjf<y> {
    private final wlf<Context> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<PaymentFailureRepository> c;
    private final wlf<a0> d;
    private final wlf<e0> e;
    private final wlf<cqe> f;
    private final wlf<y> g;
    private final wlf<y> h;

    public z(wlf<Context> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<PaymentFailureRepository> wlf3, wlf<a0> wlf4, wlf<e0> wlf5, wlf<cqe> wlf6, wlf<y> wlf7, wlf<y> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
