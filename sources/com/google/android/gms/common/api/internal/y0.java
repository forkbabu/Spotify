package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;

public final class y0<A extends d<? extends i, a.b>> extends v {
    private final A b;

    public y0(int i, A a) {
        super(i);
        g.k(a, "Null methods are not runnable.");
        this.b = a;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void b(Status status) {
        try {
            this.b.p(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(g.a<?> aVar) {
        try {
            A a = this.b;
            a.f s = aVar.s();
            a.getClass();
            try {
                a.o(s);
            } catch (DeadObjectException e) {
                a.p(new Status(8, e.getLocalizedMessage(), null));
                throw e;
            } catch (RemoteException e2) {
                a.p(new Status(8, e2.getLocalizedMessage(), null));
            }
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void d(h1 h1Var, boolean z) {
        h1Var.c(this.b, z);
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.p(new Status(10, je.j0(je.N0(localizedMessage, simpleName.length() + 2), simpleName, ": ", localizedMessage)));
        } catch (IllegalStateException unused) {
        }
    }
}
