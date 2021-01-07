package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public final class x0 extends n0<Void> {
    private final j0 c;

    public x0(j0 j0Var, h<Void> hVar) {
        super(3, hVar);
        this.c = j0Var;
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.v
    public final void b(Status status) {
        this.b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final /* bridge */ /* synthetic */ void d(h1 h1Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.v
    public final void e(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final c[] f(g.a<?> aVar) {
        return this.c.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean g(g.a<?> aVar) {
        return this.c.a.e();
    }

    @Override // com.google.android.gms.common.api.internal.n0
    public final void h(g.a<?> aVar) {
        this.c.a.d(aVar.s(), this.b);
        k.a<?> b = this.c.a.b();
        if (b != null) {
            aVar.y().put(b, this.c);
        }
    }
}
