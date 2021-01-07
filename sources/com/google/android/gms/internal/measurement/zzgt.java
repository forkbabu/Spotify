package com.google.android.gms.internal.measurement;

final class zzgt extends zzgw {
    private final int zzc;
    private final int zzd;

    zzgt(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgm.l(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzgw, com.google.android.gms.internal.measurement.zzgm
    public final byte c(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(je.f0(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(je.h0(40, "Index > length: ", i, ", ", i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzgw, com.google.android.gms.internal.measurement.zzgm
    public final int d() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgw, com.google.android.gms.internal.measurement.zzgm
    public final byte k(int i) {
        return this.zzb[this.zzc + i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzgw
    public final int t() {
        return this.zzc;
    }
}
