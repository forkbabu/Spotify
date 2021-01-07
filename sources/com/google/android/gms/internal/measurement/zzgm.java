package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgm implements Serializable, Iterable<Byte> {
    public static final zzgm a = new zzgw(h4.b);
    private static final k3 b = (e3.a() ? new n3(null) : new j3(null));
    private int zzc = 0;

    zzgm() {
    }

    public static zzgm h(byte[] bArr, int i, int i2) {
        l(i, i + i2, bArr.length);
        return new zzgw(b.a(bArr, i, i2));
    }

    static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(je.h0(66, "Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(je.h0(37, "End index: ", i2, " >= ", i3));
        }
    }

    public abstract byte c(int i);

    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(int i, int i2, int i3);

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    public abstract zzgm f(int i, int i2);

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int d = d();
            i = e(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract String i(Charset charset);

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new i3(this);
    }

    /* access modifiers changed from: package-private */
    public abstract void j(h3 h3Var);

    /* access modifiers changed from: package-private */
    public abstract byte k(int i);

    public abstract boolean n();

    /* access modifiers changed from: protected */
    public final int o() {
        return this.zzc;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x003d: APUT  (r1v1 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r2v5 java.lang.String) */
    @Override // java.lang.Object
    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? o2.l(this) : String.valueOf(o2.l(f(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
