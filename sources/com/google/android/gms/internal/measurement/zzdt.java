package com.google.android.gms.internal.measurement;

final class zzdt<T> extends zzdx<T> {
    static final zzdt<Object> a = new zzdt<>();

    private zzdt() {
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return 2040732332;
    }

    @Override // java.lang.Object
    public final String toString() {
        return "Optional.absent()";
    }
}
