package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class v6 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ i6 b;

    v6(i6 i6Var, Bundle bundle) {
        this.b = i6Var;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6.t0(this.b, this.a);
    }
}
