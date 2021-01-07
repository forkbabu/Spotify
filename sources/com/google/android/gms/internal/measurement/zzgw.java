package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class zzgw extends zzgx {
    protected final byte[] zzb;

    zzgw(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public byte c(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public int d() {
        return this.zzb.length;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public final int e(int i, int i2, int i3) {
        byte[] bArr = this.zzb;
        int t = t();
        Charset charset = h4.a;
        for (int i4 = t; i4 < t + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzgm, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgm) || d() != ((zzgm) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof zzgw)) {
            return obj.equals(this);
        }
        zzgw zzgw = (zzgw) obj;
        int o = o();
        int o2 = zzgw.o();
        if (o != 0 && o2 != 0 && o != o2) {
            return false;
        }
        int d = d();
        if (d > zzgw.d()) {
            int d2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(d);
            sb.append(d2);
            throw new IllegalArgumentException(sb.toString());
        } else if (d <= zzgw.d()) {
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzgw.zzb;
            int t = t() + d;
            int t2 = t();
            int t3 = zzgw.t();
            while (t2 < t) {
                if (bArr[t2] != bArr2[t3]) {
                    return false;
                }
                t2++;
                t3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(je.h0(59, "Ran off end of other: 0, ", d, ", ", zzgw.d()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public final zzgm f(int i, int i2) {
        int l = zzgm.l(0, i2, d());
        if (l == 0) {
            return zzgm.a;
        }
        return new zzgt(this.zzb, t(), l);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public final String i(Charset charset) {
        return new String(this.zzb, t(), d(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public final void j(h3 h3Var) {
        h3Var.a(this.zzb, t(), d());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public byte k(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public final boolean n() {
        int t = t();
        return t6.e(this.zzb, t, d() + t);
    }

    /* access modifiers changed from: protected */
    public int t() {
        return 0;
    }
}
