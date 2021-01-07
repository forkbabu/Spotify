package com.spotify.music.features.pushnotifications;

import android.content.Context;
import androidx.core.app.q;
import com.spotify.remoteconfig.ak;
import io.reactivex.s;
import io.reactivex.y;

public final class s0 implements fjf<r0> {
    private final wlf<Context> a;
    private final wlf<t0> b;
    private final wlf<o0> c;
    private final wlf<q> d;
    private final wlf<y> e;
    private final wlf<y> f;
    private final wlf<ak> g;
    private final wlf<bw7> h;
    private final wlf<s<Boolean>> i;

    public s0(wlf<Context> wlf, wlf<t0> wlf2, wlf<o0> wlf3, wlf<q> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<ak> wlf7, wlf<bw7> wlf8, wlf<s<Boolean>> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
