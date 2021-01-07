package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.k;

public final class s implements fjf<HubsGlue2MiscComponents.a> {
    private final wlf<f> a;
    private final wlf<k.a> b;
    private final wlf<k.b> c;
    private final wlf<n> d;
    private final wlf<d0> e;

    public s(wlf<f> wlf, wlf<k.a> wlf2, wlf<k.b> wlf3, wlf<n> wlf4, wlf<d0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static s a(wlf<f> wlf, wlf<k.a> wlf2, wlf<k.b> wlf3, wlf<n> wlf4, wlf<d0> wlf5) {
        return new s(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HubsGlue2MiscComponents.a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
