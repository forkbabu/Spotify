package com.spotify.music.features.login.startview.cta;

import com.spotify.loginflow.navigation.d;

public final class b implements fjf<a> {
    private final wlf<ae0> a;
    private final wlf<d> b;
    private final wlf<je0> c;

    public b(wlf<ae0> wlf, wlf<d> wlf2, wlf<je0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get());
    }
}
