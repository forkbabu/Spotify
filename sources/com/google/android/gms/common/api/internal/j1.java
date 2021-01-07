package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;

/* access modifiers changed from: package-private */
public final class j1 implements e.a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ h1 b;

    j1(h1 h1Var, BasePendingResult basePendingResult) {
        this.b = h1Var;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.e.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
