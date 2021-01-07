package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class b0 extends a0 {
    private final Callable<String> e;

    b0(Callable callable, z zVar) {
        super(false, null, null);
        this.e = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.a0
    public final String d() {
        try {
            return this.e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
