package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;
import java.util.concurrent.Executor;

public final class j1 implements a0<i1> {
    private final a0<z> a;
    private final a0<f3> b;
    private final a0<u0> c;
    private final a0<Executor> d;

    public j1(a0<z> a0Var, a0<f3> a0Var2, a0<u0> a0Var3, a0<Executor> a0Var4) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ i1 e() {
        z e = this.a.e();
        return new i1(e, z.b(this.b), this.c.e(), z.b(this.d));
    }
}
