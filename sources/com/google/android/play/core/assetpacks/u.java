package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;
import java.util.concurrent.Executor;

public final class u implements a0<t> {
    private final a0<Context> a;
    private final a0<i1> b;
    private final a0<r0> c;
    private final a0<f3> d;
    private final a0<u0> e;
    private final a0<j0> f;
    private final a0<a> g;
    private final a0<Executor> h;
    private final a0<Executor> i;

    public u(a0<Context> a0Var, a0<i1> a0Var2, a0<r0> a0Var3, a0<f3> a0Var4, a0<u0> a0Var5, a0<j0> a0Var6, a0<a> a0Var7, a0<Executor> a0Var8, a0<Executor> a0Var9) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
        this.e = a0Var5;
        this.f = a0Var6;
        this.g = a0Var7;
        this.h = a0Var8;
        this.i = a0Var9;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ t e() {
        return new t(((b3) this.a).e(), this.b.e(), this.c.e(), z.b(this.d), this.e.e(), this.f.e(), this.g.e(), z.b(this.h), z.b(this.i));
    }
}
