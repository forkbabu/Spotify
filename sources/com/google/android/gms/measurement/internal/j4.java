package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class j4 implements Runnable {
    private final g4 a;
    private final int b;
    private final Throwable c;
    private final byte[] f;
    private final String n;
    private final Map<String, List<String>> o;

    j4(String str, g4 g4Var, int i, Throwable th, byte[] bArr, Map map, h4 h4Var) {
        if (g4Var != null) {
            this.a = g4Var;
            this.b = i;
            this.c = th;
            this.f = bArr;
            this.n = str;
            this.o = map;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.n, this.b, this.c, this.f, this.o);
    }
}
