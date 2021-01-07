package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;

public final class q0 implements a0<p0> {
    private final a0<z> a;
    private final a0<f3> b;
    private final a0<t> c;
    private final a0<u0> d;

    public q0(a0<z> a0Var, a0<f3> a0Var2, a0<t> a0Var3, a0<u0> a0Var4) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ p0 e() {
        return new p0(this.a.e(), z.b(this.b), z.b(this.c), this.d.e());
    }
}
