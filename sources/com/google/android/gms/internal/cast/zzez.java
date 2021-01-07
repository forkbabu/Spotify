package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class zzez extends zzeu<E> {
    private final transient int f;
    private final transient int n;
    private final /* synthetic */ zzeu zzagr;

    zzez(zzeu zzeu, int i, int i2) {
        this.zzagr = zzeu;
        this.f = i;
        this.n = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final Object[] e() {
        return this.zzagr.e();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int f() {
        return this.zzagr.f() + this.f;
    }

    @Override // java.util.List
    public final E get(int i) {
        s.i(i, this.n);
        return (E) this.zzagr.get(i + this.f);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzet
    public final int h() {
        return this.zzagr.f() + this.f + this.n;
    }

    @Override // com.google.android.gms.internal.cast.zzeu
    /* renamed from: i */
    public final zzeu<E> subList(int i, int i2) {
        s.l(i, i2, this.n);
        zzeu zzeu = this.zzagr;
        int i3 = this.f;
        return (zzeu) zzeu.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
