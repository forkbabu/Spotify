package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class zzll extends zzli {
    protected final byte[] zzbnm;

    zzll(byte[] bArr) {
        bArr.getClass();
        this.zzbnm = bArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzlb
    public final String c(Charset charset) {
        return new String(this.zzbnm, n(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzlb
    public final void d(v4 v4Var) {
        v4Var.a(this.zzbnm, n(), size());
    }

    @Override // com.google.android.gms.internal.cast.zzlb
    public byte e(int i) {
        return this.zzbnm[i];
    }

    @Override // com.google.android.gms.internal.cast.zzlb, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlb) || size() != ((zzlb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzll)) {
            return obj.equals(this);
        }
        zzll zzll = (zzll) obj;
        int l = l();
        int l2 = zzll.l();
        if (l != 0 && l2 != 0 && l != l2) {
            return false;
        }
        int size = size();
        if (size > zzll.size()) {
            int size2 = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(size);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        } else if (size <= zzll.size()) {
            byte[] bArr = this.zzbnm;
            byte[] bArr2 = zzll.zzbnm;
            int n = n() + size;
            int n2 = n();
            int n3 = zzll.n();
            while (n2 < n) {
                if (bArr[n2] != bArr2[n3]) {
                    return false;
                }
                n2++;
                n3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(je.h0(59, "Ran off end of other: 0, ", size, ", ", zzll.size()));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzlb
    public byte f(int i) {
        return this.zzbnm[i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzlb
    public final int h(int i, int i2, int i3) {
        byte[] bArr = this.zzbnm;
        int n = n();
        Charset charset = v5.a;
        for (int i4 = n; i4 < n + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.cast.zzlb
    public final zzlb j(int i, int i2) {
        int i3 = zzlb.i(0, i2, size());
        if (i3 == 0) {
            return zzlb.a;
        }
        return new zzle(this.zzbnm, n(), i3);
    }

    @Override // com.google.android.gms.internal.cast.zzlb
    public final boolean k() {
        int n = n();
        return j8.d(this.zzbnm, n, size() + n);
    }

    /* access modifiers changed from: protected */
    public int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzlb
    public int size() {
        return this.zzbnm.length;
    }
}
