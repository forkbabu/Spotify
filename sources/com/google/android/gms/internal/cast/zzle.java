package com.google.android.gms.internal.cast;

final class zzle extends zzll {
    private final int zzbnj;
    private final int zzbnk;

    zzle(byte[] bArr, int i, int i2) {
        super(bArr);
        zzlb.i(i, i + i2, bArr.length);
        this.zzbnj = i;
        this.zzbnk = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzll, com.google.android.gms.internal.cast.zzlb
    public final byte e(int i) {
        int i2 = this.zzbnk;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zzbnm[this.zzbnj + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(je.f0(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(je.h0(40, "Index > length: ", i, ", ", i2));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzll, com.google.android.gms.internal.cast.zzlb
    public final byte f(int i) {
        return this.zzbnm[this.zzbnj + i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzll
    public final int n() {
        return this.zzbnj;
    }

    @Override // com.google.android.gms.internal.cast.zzll, com.google.android.gms.internal.cast.zzlb
    public final int size() {
        return this.zzbnk;
    }
}
