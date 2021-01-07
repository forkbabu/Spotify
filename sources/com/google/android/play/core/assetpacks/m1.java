package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;

public final class m1 implements a0<l1> {
    private final a0<i1> a;
    private final a0<z> b;
    private final a0<g0> c;

    public m1(a0<i1> a0Var, a0<z> a0Var2, a0<g0> a0Var3) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ l1 e() {
        return new l1(this.a.e(), this.b.e(), this.c.e());
    }
}
