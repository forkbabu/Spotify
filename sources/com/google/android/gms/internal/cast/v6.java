package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

final class v6 implements t6 {
    v6() {
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final int a(int i, Object obj, Object obj2) {
        zzni zzni = (zzni) obj;
        s6 s6Var = (s6) obj2;
        if (zzni.isEmpty()) {
            return 0;
        }
        Iterator it = zzni.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final Object b(Object obj, Object obj2) {
        zzni zzni = (zzni) obj;
        zzni zzni2 = (zzni) obj2;
        if (!zzni2.isEmpty()) {
            if (!zzni.b()) {
                zzni = zzni.f();
            }
            zzni.d(zzni2);
        }
        return zzni;
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final r6<?, ?> c(Object obj) {
        s6 s6Var = (s6) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final Object d(Object obj) {
        ((zzni) obj).e();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final Map<?, ?> e(Object obj) {
        return (zzni) obj;
    }
}
