package com.google.android.gms.measurement.internal;

import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l7 implements Runnable {
    private final m7 a;
    private final int b;
    private final Exception c;
    private final byte[] f;
    private final Map n;

    l7(m7 m7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.a = m7Var;
        this.b = i;
        this.c = exc;
        this.f = bArr;
        this.n = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b, this.c, this.f, this.n);
    }
}
