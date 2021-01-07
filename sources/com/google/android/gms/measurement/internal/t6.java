package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class t6 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ i6 b;

    t6(i6 i6Var, Bundle bundle) {
        this.b = i6Var;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6.N(this.b, this.a);
    }
}
