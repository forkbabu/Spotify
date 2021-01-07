package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class zzep<T> extends zzen<T> {
    private final T zzagh;

    zzep(T t) {
        this.zzagh = t;
    }

    @Override // com.google.android.gms.internal.cast.zzen
    public final T b() {
        return this.zzagh;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof zzep) {
            return this.zzagh.equals(((zzep) obj).zzagh);
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.zzagh.hashCode() + 1502476572;
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.zzagh);
        return je.j0(valueOf.length() + 13, "Optional.of(", valueOf, ")");
    }
}
