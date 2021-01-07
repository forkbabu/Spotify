package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public final class a1<ResultT> extends w0 {
    private final s<a.b, ResultT> b;
    private final h<ResultT> c;
    private final a d;

    public a1(int i, s<a.b, ResultT> sVar, h<ResultT> hVar, a aVar) {
        super(i);
        this.c = hVar;
        this.b = sVar;
        this.d = aVar;
        if (i == 2 && sVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void b(Status status) {
        h<ResultT> hVar = this.c;
        this.d.getClass();
        hVar.d(f.c(status));
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(g.a<?> aVar) {
        try {
            this.b.b(aVar.s(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            Status a = v.a(e2);
            h<ResultT> hVar = this.c;
            this.d.getClass();
            hVar.d(f.c(a));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void d(h1 h1Var, boolean z) {
        h1Var.d(this.c, z);
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void e(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final c[] f(g.a<?> aVar) {
        return this.b.d();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean g(g.a<?> aVar) {
        return this.b.c();
    }
}
