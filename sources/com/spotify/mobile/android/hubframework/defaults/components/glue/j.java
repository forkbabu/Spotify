package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;

public final class j implements fjf<HubsGlueComponent.a> {
    private final wlf<c0> a;
    private final wlf<c> b;
    private final wlf<l> c;
    private final wlf<n.b> d;
    private final wlf<n.d> e;
    private final wlf<n.c> f;
    private final wlf<a0> g;

    public j(wlf<c0> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<n.b> wlf4, wlf<n.d> wlf5, wlf<n.c> wlf6, wlf<a0> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static j a(wlf<c0> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<n.b> wlf4, wlf<n.d> wlf5, wlf<n.c> wlf6, wlf<a0> wlf7) {
        return new j(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HubsGlueComponent.a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
