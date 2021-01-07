package com.spotify.mobile.android.coreintegration;

import android.content.Context;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.t;
import java.util.Random;

public final class e0 implements fjf<d0> {
    private final wlf<Context> a;
    private final wlf<OrbitFactory> b;
    private final wlf<t> c;
    private final wlf<Random> d;
    private final wlf<o0> e;

    public e0(wlf<Context> wlf, wlf<OrbitFactory> wlf2, wlf<t> wlf3, wlf<Random> wlf4, wlf<o0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d0 a(Context context, OrbitFactory orbitFactory, t tVar, Random random, o0 o0Var) {
        return new d0(context, orbitFactory, tVar, random, o0Var);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
