package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;

public final class s0 implements a0<r0> {
    private final a0<i1> a;
    private final a0<f3> b;
    private final a0<p0> c;
    private final a0<m2> d;
    private final a0<w1> e;
    private final a0<a2> f;
    private final a0<f2> g;
    private final a0<l1> h;

    public s0(a0<i1> a0Var, a0<f3> a0Var2, a0<p0> a0Var3, a0<m2> a0Var4, a0<w1> a0Var5, a0<a2> a0Var6, a0<f2> a0Var7, a0<l1> a0Var8) {
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
    public final /* bridge */ /* synthetic */ r0 e() {
        return new r0(this.a.e(), z.b(this.b), this.c.e(), this.d.e(), this.e.e(), this.f.e(), this.g.e(), this.h.e());
    }
}
