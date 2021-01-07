package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.common.a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* access modifiers changed from: package-private */
/* renamed from: p30  reason: default package */
public final class p30 {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(a aVar, ErrorCorrectionLevel errorCorrectionLevel, com.google.zxing.qrcode.decoder.a aVar2, int i, m30 m30) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        m30.a((byte) -1);
        int length = a[0].length;
        d(0, 0, m30);
        d(m30.e() - length, 0, m30);
        d(0, m30.e() - length, m30);
        c(0, 7, m30);
        c(m30.e() - 8, 7, m30);
        c(0, m30.e() - 8, m30);
        e(7, 0, m30);
        e((m30.d() - 7) - 1, 0, m30);
        e(7, m30.d() - 7, m30);
        if (m30.b(8, m30.d() - 8) != 0) {
            m30.f(8, m30.d() - 8, 1);
            if (aVar2.f() >= 2) {
                int[] iArr = c[aVar2.f() - 1];
                for (int i6 : iArr) {
                    if (i6 >= 0) {
                        for (int i7 : iArr) {
                            if (i7 >= 0 && g(m30.b(i7, i6))) {
                                int i8 = i7 - 2;
                                int i9 = i6 - 2;
                                for (int i10 = 0; i10 < 5; i10++) {
                                    int[] iArr2 = b[i10];
                                    for (int i11 = 0; i11 < 5; i11++) {
                                        m30.f(i8 + i11, i9 + i10, iArr2[i11]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i12 = 8;
            while (i12 < m30.e() - 8) {
                int i13 = i12 + 1;
                int i14 = i13 % 2;
                if (g(m30.b(i12, 6))) {
                    m30.f(i12, 6, i14);
                }
                if (g(m30.b(6, i12))) {
                    m30.f(6, i12, i14);
                }
                i12 = i13;
            }
            a aVar3 = new a();
            if (i >= 0 && i < 8) {
                int d2 = (errorCorrectionLevel.d() << 3) | i;
                aVar3.d(d2, 5);
                aVar3.d(b(d2, 1335), 10);
                a aVar4 = new a();
                aVar4.d(21522, 15);
                aVar3.k(aVar4);
                if (aVar3.g() == 15) {
                    for (int i15 = 0; i15 < aVar3.g(); i15++) {
                        boolean f = aVar3.f((aVar3.g() - 1) - i15);
                        int[] iArr3 = d[i15];
                        m30.g(iArr3[0], iArr3[1], f);
                        if (i15 < 8) {
                            m30.g((m30.e() - i15) - 1, 8, f);
                        } else {
                            m30.g(8, (i15 - 8) + (m30.d() - 7), f);
                        }
                    }
                    if (aVar2.f() >= 7) {
                        a aVar5 = new a();
                        aVar5.d(aVar2.f(), 6);
                        aVar5.d(b(aVar2.f(), 7973), 12);
                        if (aVar5.g() == 18) {
                            int i16 = 17;
                            for (int i17 = 0; i17 < 6; i17++) {
                                for (int i18 = 0; i18 < 3; i18++) {
                                    boolean f2 = aVar5.f(i16);
                                    i16--;
                                    m30.g(i17, (m30.d() - 11) + i18, f2);
                                    m30.g((m30.d() - 11) + i18, i17, f2);
                                }
                            }
                        } else {
                            throw new WriterException("should not happen but we got: " + aVar5.g());
                        }
                    }
                    int e = m30.e() - 1;
                    int d3 = m30.d() - 1;
                    int i19 = 0;
                    int i20 = -1;
                    while (e > 0) {
                        if (e == 6) {
                            e--;
                        }
                        while (d3 >= 0 && d3 < m30.d()) {
                            for (int i21 = 0; i21 < 2; i21++) {
                                int i22 = e - i21;
                                if (g(m30.b(i22, d3))) {
                                    if (i19 < aVar.g()) {
                                        z = aVar.f(i19);
                                        i19++;
                                    } else {
                                        z = false;
                                    }
                                    if (i != -1) {
                                        switch (i) {
                                            case 0:
                                                i3 = d3 + i22;
                                                i2 = i3 & 1;
                                                break;
                                            case 1:
                                                i3 = d3;
                                                i2 = i3 & 1;
                                                break;
                                            case 2:
                                                i2 = i22 % 3;
                                                break;
                                            case 3:
                                                i2 = (d3 + i22) % 3;
                                                break;
                                            case 4:
                                                i3 = (i22 / 3) + (d3 / 2);
                                                i2 = i3 & 1;
                                                break;
                                            case 5:
                                                int i23 = d3 * i22;
                                                i2 = (i23 % 3) + (i23 & 1);
                                                break;
                                            case 6:
                                                int i24 = d3 * i22;
                                                i4 = i24 & 1;
                                                i5 = i24 % 3;
                                                i3 = i5 + i4;
                                                i2 = i3 & 1;
                                                break;
                                            case 7:
                                                i5 = (d3 * i22) % 3;
                                                i4 = (d3 + i22) & 1;
                                                i3 = i5 + i4;
                                                i2 = i3 & 1;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                                        }
                                        if (i2 == 0) {
                                            z = !z;
                                        }
                                    }
                                    m30.g(i22, d3, z);
                                }
                            }
                            d3 += i20;
                        }
                        i20 = -i20;
                        d3 += i20;
                        e -= 2;
                    }
                    if (i19 != aVar.g()) {
                        throw new WriterException("Not all bits consumed: " + i19 + '/' + aVar.g());
                    }
                    return;
                }
                throw new WriterException("should not happen but we got: " + aVar3.g());
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    static int b(int i, int i2) {
        if (i2 != 0) {
            int f = f(i2);
            int i3 = i << (f - 1);
            while (f(i3) >= f) {
                i3 ^= i2 << (f(i3) - f);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    private static void c(int i, int i2, m30 m30) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (g(m30.b(i4, i2))) {
                m30.f(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    private static void d(int i, int i2, m30 m30) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                m30.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void e(int i, int i2, m30 m30) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (g(m30.b(i, i4))) {
                m30.f(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    static int f(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static boolean g(int i) {
        return i == -1;
    }
}
