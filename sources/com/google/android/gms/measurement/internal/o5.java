package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class o5 implements Callable<List<oa>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ g5 f;

    o5(g5 g5Var, String str, String str2, String str3) {
        this.f = g5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<oa> call() {
        g5.D3(this.f).d0();
        return g5.D3(this.f).U().h0(this.a, this.b, this.c);
    }
}