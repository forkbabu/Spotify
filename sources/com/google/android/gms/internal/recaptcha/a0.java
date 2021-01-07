package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;

final class a0 extends b0<g0.c> {
    a0() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.b0
    public final c0<g0.c> a(Object obj) {
        return ((g0.d) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.b0
    public final boolean b(f1 f1Var) {
        return f1Var instanceof g0.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.b0
    public final c0<g0.c> c(Object obj) {
        g0.d dVar = (g0.d) obj;
        if (dVar.zzc.j()) {
            dVar.zzc = (c0) dVar.zzc.clone();
        }
        return dVar.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.b0
    public final void d(Object obj) {
        ((g0.d) obj).zzc.g();
    }
}
