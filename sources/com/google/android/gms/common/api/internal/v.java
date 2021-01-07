package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;

public abstract class v {
    public final int a;

    public v(int i) {
        this.a = i;
    }

    static Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void b(Status status);

    public abstract void c(g.a<?> aVar);

    public abstract void d(h1 h1Var, boolean z);

    public abstract void e(Exception exc);
}
