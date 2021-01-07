package io.netty.handler.codec.base64;

import io.netty.buffer.j;
import io.netty.buffer.k;

public final class a {
    public static j a(j jVar, int i, int i2, boolean z, Base64Dialect base64Dialect, k kVar) {
        if (base64Dialect != null) {
            int i3 = (i2 * 4) / 3;
            j Z0 = kVar.j((i2 % 3 > 0 ? 4 : 0) + i3 + (z ? i3 / 76 : 0)).Z0(jVar.a1());
            int i4 = i2 - 2;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                c(jVar, i5 + i, 3, Z0, i6, base64Dialect);
                i7 += 4;
                if (z && i7 == 76) {
                    Z0.w1(i6 + 4, 10);
                    i6++;
                    i7 = 0;
                }
                i5 += 3;
                i6 += 4;
            }
            if (i5 < i2) {
                c(jVar, i5 + i, i2 - i5, Z0, i6, base64Dialect);
                i6 += 4;
            }
            if (i6 > 1) {
                int i8 = i6 - 1;
                if (Z0.S(i8) == 10) {
                    i6 = i8;
                }
            }
            return Z0.K1(0, i6);
        }
        throw new NullPointerException("dialect");
    }

    public static j b(j jVar, boolean z) {
        Base64Dialect base64Dialect = Base64Dialect.STANDARD;
        if (jVar != null) {
            j a = a(jVar, jVar.n1(), jVar.m1(), z, base64Dialect, jVar.t());
            jVar.p1(jVar.Z1());
            return a;
        }
        throw new NullPointerException("src");
    }

    private static void c(j jVar, int i, int i2, j jVar2, int i3, Base64Dialect base64Dialect) {
        byte[] bArr = base64Dialect.alphabet;
        int i4 = 0;
        int S = (i2 > 0 ? (jVar.S(i) << 24) >>> 8 : 0) | (i2 > 1 ? (jVar.S(i + 1) << 24) >>> 16 : 0);
        if (i2 > 2) {
            i4 = (jVar.S(i + 2) << 24) >>> 24;
        }
        int i5 = S | i4;
        if (i2 == 1) {
            jVar2.w1(i3, bArr[i5 >>> 18]);
            jVar2.w1(i3 + 1, bArr[(i5 >>> 12) & 63]);
            jVar2.w1(i3 + 2, 61);
            jVar2.w1(i3 + 3, 61);
        } else if (i2 == 2) {
            jVar2.w1(i3, bArr[i5 >>> 18]);
            jVar2.w1(i3 + 1, bArr[(i5 >>> 12) & 63]);
            jVar2.w1(i3 + 2, bArr[(i5 >>> 6) & 63]);
            jVar2.w1(i3 + 3, 61);
        } else if (i2 == 3) {
            jVar2.w1(i3, bArr[i5 >>> 18]);
            jVar2.w1(i3 + 1, bArr[(i5 >>> 12) & 63]);
            jVar2.w1(i3 + 2, bArr[(i5 >>> 6) & 63]);
            jVar2.w1(i3 + 3, bArr[i5 & 63]);
        }
    }
}
