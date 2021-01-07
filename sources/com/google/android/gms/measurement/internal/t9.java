package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class t9 implements g4 {
    private final /* synthetic */ String a;
    private final /* synthetic */ r9 b;

    t9(r9 r9Var, String str) {
        this.b = r9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.f(i, th, bArr);
    }
}
