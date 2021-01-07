package defpackage;

import com.google.zxing.common.a;
import com.google.zxing.common.b;
import com.google.zxing.common.reedsolomon.c;

/* renamed from: d30  reason: default package */
public final class d30 {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static void a(b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.f(i5, i4);
                bVar.f(i5, i6);
                bVar.f(i4, i5);
                bVar.f(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.f(i7, i7);
        int i8 = i7 + 1;
        bVar.f(i8, i7);
        bVar.f(i7, i8);
        int i9 = i + i2;
        bVar.f(i9, i7);
        bVar.f(i9, i8);
        bVar.f(i9, i9 - 1);
    }

    public static b30 b(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        a aVar;
        int i5;
        a aVar2;
        int i6;
        int[] iArr = a;
        a a2 = new e30(bArr).a();
        int i7 = 11;
        int g = ((a2.g() * i) / 100) + 11;
        int g2 = a2.g() + g;
        int i8 = 32;
        int i9 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i3 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i3 <= i8) {
                i4 = ((z ? 88 : 112) + (i3 << 4)) * i3;
                i5 = iArr[i3];
                int i10 = i4 - (i4 % i5);
                aVar = d(a2, i5);
                if (aVar.g() + g > i10) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.g() > (i5 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            a aVar3 = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= i8) {
                boolean z2 = i11 <= 3;
                int i13 = z2 ? i11 + 1 : i11;
                i4 = ((z2 ? 88 : 112) + (i13 << 4)) * i13;
                if (g2 <= i4) {
                    if (aVar3 == null || i12 != iArr[i13]) {
                        int i14 = iArr[i13];
                        aVar3 = d(a2, i14);
                        i12 = i14;
                    }
                    int i15 = i4 - (i4 % i12);
                    if ((!z2 || aVar3.g() <= (i12 << 6)) && aVar3.g() + g <= i15) {
                        aVar = aVar3;
                        i5 = i12;
                        z = z2;
                        i3 = i13;
                    }
                }
                i11++;
                i8 = 32;
                i9 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a c = c(aVar, i4, i5);
        int g3 = aVar.g() / i5;
        a aVar4 = new a();
        int i16 = 2;
        if (z) {
            aVar4.d(i3 - 1, 2);
            aVar4.d(g3 - 1, 6);
            aVar2 = c(aVar4, 28, 4);
        } else {
            aVar4.d(i3 - 1, 5);
            aVar4.d(g3 - 1, 11);
            aVar2 = c(aVar4, 40, 4);
        }
        if (!z) {
            i7 = 14;
        }
        int i17 = i7 + (i3 << 2);
        int[] iArr2 = new int[i17];
        if (z) {
            for (int i18 = 0; i18 < i17; i18++) {
                iArr2[i18] = i18;
            }
            i6 = i17;
        } else {
            int i19 = i17 / 2;
            i6 = (((i19 - 1) / 15) * 2) + i17 + 1;
            int i20 = i6 / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                int i22 = (i21 / 15) + i21;
                iArr2[(i19 - i21) - i9] = (i20 - i22) - i9;
                iArr2[i19 + i21] = i22 + i20 + i9;
            }
        }
        b bVar = new b(i6, i6);
        int i23 = 0;
        int i24 = 0;
        while (i23 < i3) {
            int i25 = ((i3 - i23) << i16) + (z ? 9 : 12);
            int i26 = 0;
            while (i26 < i25) {
                int i27 = i26 << 1;
                int i28 = 0;
                while (i28 < i16) {
                    if (c.f(i24 + i27 + i28)) {
                        int i29 = i23 << 1;
                        bVar.f(iArr2[i29 + i28], iArr2[i29 + i26]);
                    }
                    if (c.f((i25 << 1) + i24 + i27 + i28)) {
                        int i30 = i23 << 1;
                        bVar.f(iArr2[i30 + i26], iArr2[((i17 - 1) - i30) - i28]);
                    }
                    if (c.f((i25 << 2) + i24 + i27 + i28)) {
                        int i31 = (i17 - 1) - (i23 << 1);
                        bVar.f(iArr2[i31 - i28], iArr2[i31 - i26]);
                    }
                    if (c.f((i25 * 6) + i24 + i27 + i28)) {
                        int i32 = i23 << 1;
                        bVar.f(iArr2[((i17 - 1) - i32) - i26], iArr2[i32 + i28]);
                    }
                    i28++;
                    i16 = 2;
                }
                i26++;
                i16 = 2;
            }
            i24 += i25 << 3;
            i23++;
            i16 = 2;
        }
        int i33 = i6 / 2;
        int i34 = 0;
        if (z) {
            while (i34 < 7) {
                int i35 = (i33 - 3) + i34;
                if (aVar2.f(i34)) {
                    bVar.f(i35, i33 - 5);
                }
                if (aVar2.f(i34 + 7)) {
                    bVar.f(i33 + 5, i35);
                }
                if (aVar2.f(20 - i34)) {
                    bVar.f(i35, i33 + 5);
                }
                if (aVar2.f(27 - i34)) {
                    bVar.f(i33 - 5, i35);
                }
                i34++;
            }
        } else {
            while (i34 < 10) {
                int i36 = (i34 / 5) + (i33 - 5) + i34;
                if (aVar2.f(i34)) {
                    bVar.f(i36, i33 - 7);
                }
                if (aVar2.f(i34 + 10)) {
                    bVar.f(i33 + 7, i36);
                }
                if (aVar2.f(29 - i34)) {
                    bVar.f(i36, i33 + 7);
                }
                if (aVar2.f(39 - i34)) {
                    bVar.f(i33 - 7, i36);
                }
                i34++;
            }
        }
        if (z) {
            a(bVar, i33, 5);
        } else {
            a(bVar, i33, 7);
            int i37 = 0;
            int i38 = 0;
            while (i37 < (i17 / 2) - 1) {
                for (int i39 = i33 & 1; i39 < i6; i39 += 2) {
                    int i40 = i33 - i38;
                    bVar.f(i40, i39);
                    int i41 = i33 + i38;
                    bVar.f(i41, i39);
                    bVar.f(i39, i40);
                    bVar.f(i39, i41);
                }
                i37 += 15;
                i38 += 16;
            }
        }
        b30 b30 = new b30();
        b30.b(bVar);
        return b30;
    }

    private static a c(a aVar, int i, int i2) {
        com.google.zxing.common.reedsolomon.a aVar2;
        int g = aVar.g() / i2;
        if (i2 == 4) {
            aVar2 = com.google.zxing.common.reedsolomon.a.j;
        } else if (i2 == 6) {
            aVar2 = com.google.zxing.common.reedsolomon.a.i;
        } else if (i2 == 8) {
            aVar2 = com.google.zxing.common.reedsolomon.a.l;
        } else if (i2 == 10) {
            aVar2 = com.google.zxing.common.reedsolomon.a.h;
        } else if (i2 == 12) {
            aVar2 = com.google.zxing.common.reedsolomon.a.g;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
        }
        c cVar = new c(aVar2);
        int i3 = i / i2;
        int[] iArr = new int[i3];
        int g2 = aVar.g() / i2;
        for (int i4 = 0; i4 < g2; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= aVar.f((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        cVar.a(iArr, i3 - g);
        a aVar3 = new a();
        aVar3.d(0, i % i2);
        for (int i7 = 0; i7 < i3; i7++) {
            aVar3.d(iArr[i7], i2);
        }
        return aVar3;
    }

    static a d(a aVar, int i) {
        a aVar2 = new a();
        int g = aVar.g();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < g) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= g || aVar.f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.d(i7, i);
            } else if (i7 == 0) {
                aVar2.d(i4 | 1, i);
            } else {
                aVar2.d(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }
}
