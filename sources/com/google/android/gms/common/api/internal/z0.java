package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public final class z0 extends n0<Boolean> {
    private final k.a<?> c;

    public z0(k.a<?> aVar, h<Boolean> hVar) {
        super(4, hVar);
        this.c = aVar;
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
        j0 j0Var = aVar.y().get(this.c);
        if (j0Var == null) {
            return null;
        }
        return j0Var.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean g(g.a<?> aVar) {
        j0 j0Var = aVar.y().get(this.c);
        return j0Var != null && j0Var.a.e();
    }

    @Override // com.google.android.gms.common.api.internal.n0
    public final void h(g.a<?> aVar) {
        j0 remove = aVar.y().remove(this.c);
        if (remove != null) {
            remove.b.b(aVar.s(), this.b);
            remove.a.a();
            return;
        }
        this.b.e((T) Boolean.FALSE);
    }
}
