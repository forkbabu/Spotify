package com.google.android.gms.internal.recaptcha;

final class zzda extends zzdd {
    private final int zzc;
    private final int zzd;

    zzda(byte[] bArr, int i, int i2) {
        super(bArr);
        zzct.j(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzdd, com.google.android.gms.internal.recaptcha.zzct
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

    @Override // com.google.android.gms.internal.recaptcha.zzdd, com.google.android.gms.internal.recaptcha.zzct
    public final int d() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdd, com.google.android.gms.internal.recaptcha.zzct
    public final byte i(int i) {
        return this.zzb[this.zzc + i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.zzdd
    public final int n() {
        return this.zzc;
    }
}
