package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;

/* access modifiers changed from: package-private */
public final class r0 implements Runnable {
    private final /* synthetic */ p0 a;

    r0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((g.c) this.a.g).c(new ConnectionResult(4));
    }
}
