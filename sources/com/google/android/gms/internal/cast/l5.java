package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;
import java.util.Map;

final class l5 extends i5<r5.c> {
    l5() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final int a(Map.Entry<?, ?> entry) {
        r5.c cVar = (r5.c) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final void b(o8 o8Var, Map.Entry<?, ?> entry) {
        r5.c cVar = (r5.c) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final n5<r5.c> c(Object obj) {
        return ((r5.d) obj).zzbre;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final boolean d(z6 z6Var) {
        return z6Var instanceof r5.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final n5<r5.c> e(Object obj) {
        r5.d dVar = (r5.d) obj;
        if (dVar.zzbre.a()) {
            dVar.zzbre = (n5) dVar.zzbre.clone();
        }
        return dVar.zzbre;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.i5
    public final void f(Object obj) {
        ((r5.d) obj).zzbre.o();
    }
}
