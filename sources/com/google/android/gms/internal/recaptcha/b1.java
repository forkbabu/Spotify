package com.google.android.gms.internal.recaptcha;

import java.util.Map;

final class b1 implements z0 {
    b1() {
    }

    @Override // com.google.android.gms.internal.recaptcha.z0
    public final Map<?, ?> c(Object obj) {
        return (zzfi) obj;
    }

    @Override // com.google.android.gms.internal.recaptcha.z0
    public final Object d(Object obj, Object obj2) {
        zzfi zzfi = (zzfi) obj;
        zzfi zzfi2 = (zzfi) obj2;
        if (!zzfi2.isEmpty()) {
            if (!zzfi.g()) {
                zzfi = zzfi.e();
            }
            zzfi.d(zzfi2);
        }
        return zzfi;
    }

    @Override // com.google.android.gms.internal.recaptcha.z0
    public final Object e(Object obj) {
        ((zzfi) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.recaptcha.z0
    public final x0<?, ?> g(Object obj) {
        ((y0) obj).getClass();
        return null;
    }
}
