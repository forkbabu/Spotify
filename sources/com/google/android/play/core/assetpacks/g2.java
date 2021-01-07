package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;

public final class g2 implements a0<f2> {
    private final a0<z> a;
    private final a0<f3> b;
    private final a0<a> c;

    public g2(a0<z> a0Var, a0<f3> a0Var2, a0<a> a0Var3) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ f2 e() {
        return new f2(this.a.e(), z.b(this.b), this.c.e());
    }
}
