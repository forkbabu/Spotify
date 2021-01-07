package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;
import com.google.android.play.core.splitinstall.a;
import java.util.concurrent.Executor;

public final class t2 implements a0<s2> {
    private final a0<z> a;
    private final a0<f3> b;
    private final a0<t> c;
    private final a0<a> d;
    private final a0<i1> e;
    private final a0<u0> f;
    private final a0<j0> g;
    private final a0<Executor> h;

    public t2(a0<z> a0Var, a0<f3> a0Var2, a0<t> a0Var3, a0<a> a0Var4, a0<i1> a0Var5, a0<u0> a0Var6, a0<j0> a0Var7, a0<Executor> a0Var8) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
        this.e = a0Var5;
        this.f = a0Var6;
        this.g = a0Var7;
        this.h = a0Var8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ s2 e() {
        return new s2(this.a.e(), z.b(this.b), this.c.e(), this.d.e(), this.e.e(), this.f.e(), this.g.e(), z.b(this.h));
    }
}
