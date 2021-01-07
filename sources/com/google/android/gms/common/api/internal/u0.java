package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final class u0 extends s<A, ResultT> {
    private final /* synthetic */ s.a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u0(s.a aVar, c[] cVarArr, boolean z, int i) {
        super(cVarArr, z, i);
        this.d = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.s
    public final void b(A a, h<ResultT> hVar) {
        this.d.a.a(a, hVar);
    }
}
