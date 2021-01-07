package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final class i1 implements c<TResult> {
    private final /* synthetic */ h a;
    private final /* synthetic */ h1 b;

    i1(h1 h1Var, h hVar) {
        this.b = h1Var;
        this.a = hVar;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g<TResult> gVar) {
        this.b.b.remove(this.a);
    }
}
