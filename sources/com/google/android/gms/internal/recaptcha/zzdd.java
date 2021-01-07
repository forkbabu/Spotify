package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class zzdd extends zzde {
    protected final byte[] zzb;

    zzdd(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public byte c(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public int d() {
        return this.zzb.length;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final int e(int i, int i2, int i3) {
        byte[] bArr = this.zzb;
        int n = n();
        Charset charset = i0.a;
        for (int i4 = n; i4 < n + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzct) || d() != ((zzct) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return obj.equals(this);
        }
        zzdd zzdd = (zzdd) obj;
        int l = l();
        int l2 = zzdd.l();
        if (l != 0 && l2 != 0 && l != l2) {
            return false;
        }
        int d = d();
        if (d > zzdd.d()) {
            int d2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(d);
            sb.append(d2);
            throw new IllegalArgumentException(sb.toString());
        } else if (d <= zzdd.d()) {
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzdd.zzb;
            int n = n() + d;
            int n2 = n();
            int n3 = zzdd.n();
            while (n2 < n) {
                if (bArr[n2] != bArr2[n3]) {
                    return false;
                }
                n2++;
                n3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(je.h0(59, "Ran off end of other: 0, ", d, ", ", zzdd.d()));
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final zzct f(int i, int i2) {
        int j = zzct.j(0, i2, d());
        if (j == 0) {
            return zzct.a;
        }
        return new zzda(this.zzb, n(), j);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final String h(Charset charset) {
        return new String(this.zzb, n(), d(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzct
    public byte i(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final boolean k() {
        int n = n();
        return l2.c(this.zzb, n, d() + n);
    }

    /* access modifiers changed from: protected */
    public int n() {
        return 0;
    }
}
