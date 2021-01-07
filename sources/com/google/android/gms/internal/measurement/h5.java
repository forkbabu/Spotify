package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class h5 implements f5 {
    h5() {
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Map<?, ?> b(Object obj) {
        return (zzja) obj;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Map<?, ?> c(Object obj) {
        return (zzja) obj;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Object d(Object obj, Object obj2) {
        zzja zzja = (zzja) obj;
        zzja zzja2 = (zzja) obj2;
        if (!zzja2.isEmpty()) {
            if (!zzja.j()) {
                zzja = zzja.f();
            }
            zzja.e(zzja2);
        }
        return zzja;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Object e(Object obj) {
        ((zzja) obj).g();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final boolean f(Object obj) {
        return !((zzja) obj).j();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final d5<?, ?> g(Object obj) {
        e5 e5Var = (e5) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Object h(Object obj) {
        return zzja.d().f();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final int i(int i, Object obj, Object obj2) {
        zzja zzja = (zzja) obj;
        e5 e5Var = (e5) obj2;
        if (zzja.isEmpty()) {
            return 0;
        }
        Iterator it = zzja.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
