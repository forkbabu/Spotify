package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class zzdz<T> extends zzdx<T> {
    private final T zza;

    zzdz(T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final T c() {
        return this.zza;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof zzdz) {
            return this.zza.equals(((zzdz) obj).zza);
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return je.j0(valueOf.length() + 13, "Optional.of(", valueOf, ")");
    }
}
