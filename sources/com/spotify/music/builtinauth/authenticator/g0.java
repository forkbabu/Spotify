package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.model.FieldValidator;
import com.spotify.remoteconfig.u7;

public final class g0 implements fjf<f0> {
    private final wlf<u7> a;
    private final wlf<n0> b;
    private final wlf<l0> c;
    private final wlf<i0> d;
    private final wlf<jl2> e;
    private final wlf<FieldValidator> f;

    public g0(wlf<u7> wlf, wlf<n0> wlf2, wlf<l0> wlf3, wlf<i0> wlf4, wlf<jl2> wlf5, wlf<FieldValidator> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
