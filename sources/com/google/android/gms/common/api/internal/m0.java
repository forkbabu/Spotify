package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final class m0 extends o<A, L> {
    private final /* synthetic */ p.a e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m0(p.a aVar, k kVar, c[] cVarArr, boolean z, int i) {
        super(kVar, cVarArr, z, i);
        this.e = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.o
    public final void d(A a, h<Void> hVar) {
        this.e.a.a(a, hVar);
    }
}
