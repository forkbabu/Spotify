package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.b;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.p;

public final class v implements fjf<HubsGlue2Row.a> {
    private final wlf<t> a;
    private final wlf<b.C0179b> b;
    private final wlf<p.a> c;
    private final wlf<b.c> d;
    private final wlf<p.b> e;
    private final wlf<h0> f;

    public v(wlf<t> wlf, wlf<b.C0179b> wlf2, wlf<p.a> wlf3, wlf<b.c> wlf4, wlf<p.b> wlf5, wlf<h0> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static v a(wlf<t> wlf, wlf<b.C0179b> wlf2, wlf<p.a> wlf3, wlf<b.c> wlf4, wlf<p.b> wlf5, wlf<h0> wlf6) {
        return new v(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HubsGlue2Row.a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
