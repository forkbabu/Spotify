package com.google.android.gms.internal.measurement;

import com.google.android.gms.cast.framework.f;
import java.io.Serializable;
import java.util.Arrays;

final class zzef<T> implements p2<T>, Serializable {
    private final T zza;

    zzef(T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.p2
    public final T a() {
        return this.zza;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof zzef) {
            return f.o(this.zza, ((zzef) obj).zza);
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return je.j0(valueOf.length() + 22, "Suppliers.ofInstance(", valueOf, ")");
    }
}
