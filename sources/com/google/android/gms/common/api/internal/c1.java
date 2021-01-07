package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class c1 {
    private final int a;
    private final ConnectionResult b;

    c1(ConnectionResult connectionResult, int i) {
        if (connectionResult != null) {
            this.b = connectionResult;
            this.a = i;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult b() {
        return this.b;
    }
}
