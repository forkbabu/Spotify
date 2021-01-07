package com.spotify.music.settings;

import com.spotify.cosmos.android.FireAndForgetResolver;

public final class b implements fjf<a> {
    private final wlf<d> a;
    private final wlf<FireAndForgetResolver> b;

    public b(wlf<d> wlf, wlf<FireAndForgetResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
