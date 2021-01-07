package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public abstract class n0<T> extends w0 {
    protected final h<T> b;

    public n0(int i, h<T> hVar) {
        super(i);
        this.b = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public abstract void b(Status status);

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(g.a<?> aVar) {
        try {
            h(aVar);
        } catch (DeadObjectException e) {
            b(v.a(e));
            throw e;
        } catch (RemoteException e2) {
            b(v.a(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public abstract void e(Exception exc);

    /* access modifiers changed from: protected */
    public abstract void h(g.a<?> aVar);
}
