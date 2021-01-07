package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;
import java.util.concurrent.Executor;

public final class b2 implements a0<a2> {
    private final a0<z> a;
    private final a0<f3> b;
    private final a0<i1> c;
    private final a0<Executor> d;
    private final a0<u0> e;

    public b2(a0<z> a0Var, a0<f3> a0Var2, a0<i1> a0Var3, a0<Executor> a0Var4, a0<u0> a0Var5) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
        this.e = a0Var5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ a2 e() {
        z e2 = this.a.e();
        return new a2(e2, z.b(this.b), this.c.e(), z.b(this.d), this.e.e());
    }
}
