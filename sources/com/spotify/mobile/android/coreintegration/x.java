package com.spotify.mobile.android.coreintegration;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.spotify.mobile.android.service.o;
import com.spotify.music.storage.j;
import io.reactivex.y;

public final class x implements fjf<CoreIntegration> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<t> c;
    private final wlf<y> d;
    private final wlf<wj7> e;
    private final wlf<o> f;
    private final wlf<j> g;
    private final wlf<StateRestoreFileDeleter> h;
    private final wlf<f0> i;
    private final wlf<l01> j;
    private final wlf<qw9> k;
    private final wlf<d0> l;
    private final wlf<Lifecycle> m;
    private final wlf<zw9> n;

    public x(wlf<Context> wlf, wlf<y> wlf2, wlf<t> wlf3, wlf<y> wlf4, wlf<wj7> wlf5, wlf<o> wlf6, wlf<j> wlf7, wlf<StateRestoreFileDeleter> wlf8, wlf<f0> wlf9, wlf<l01> wlf10, wlf<qw9> wlf11, wlf<d0> wlf12, wlf<Lifecycle> wlf13, wlf<zw9> wlf14) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
    }

    public static CoreIntegration a(Context context, y yVar, Object obj, Object obj2, wj7 wj7, o oVar, j jVar, Object obj3, f0 f0Var, l01 l01, qw9 qw9, Object obj4, Lifecycle lifecycle, zw9 zw9) {
        return new CoreIntegration(context, yVar, (t) obj, (y) obj2, wj7, oVar, jVar, (StateRestoreFileDeleter) obj3, f0Var, l01, qw9, (d0) obj4, lifecycle, zw9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
