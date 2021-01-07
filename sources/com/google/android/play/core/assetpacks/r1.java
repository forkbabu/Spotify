package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.z;
import java.io.File;
import java.util.concurrent.Executor;

public final class r1 implements a0<q1> {
    private final a0<String> a;
    private final a0<t> b;
    private final a0<u0> c;
    private final a0<Context> d;
    private final a0<c2> e;
    private final a0<Executor> f;

    public r1(a0<String> a0Var, a0<t> a0Var2, a0<u0> a0Var3, a0<Context> a0Var4, a0<c2> a0Var5, a0<Executor> a0Var6) {
        this.a = a0Var;
        this.b = a0Var2;
        this.c = a0Var3;
        this.d = a0Var4;
        this.e = a0Var5;
        this.f = a0Var6;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ q1 e() {
        String e2 = this.a.e();
        t e3 = this.b.e();
        u0 e4 = this.c.e();
        Context a2 = ((b3) this.d).e();
        c2 e5 = this.e.e();
        return new q1(e2 != null ? new File(a2.getExternalFilesDir(null), e2) : a2.getExternalFilesDir(null), e3, e4, a2, e5, z.b(this.f));
    }
}
