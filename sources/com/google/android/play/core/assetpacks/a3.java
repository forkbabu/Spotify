package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.m;
import com.google.android.play.core.internal.z;

public final class a3 implements a0<f3> {
    private final a0<Context> a;
    private final a0<o> b;
    private final a0<q1> c;

    public a3(a0<Context> a0Var, a0<o> a0Var2, a0<q1> a0Var3) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ f3 e() {
        f3 f3Var = (f3) (w2.b(((b3) this.a).e()) == null ? z.b(this.b).e() : z.b(this.c).e());
        m.e(f3Var);
        return f3Var;
    }
}
