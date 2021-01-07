package com.google.android.exoplayer2.util;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

public final class j {
    private static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    private static int b(u uVar) {
        int h = uVar.h(4);
        if (h == 15) {
            return uVar.h(24);
        }
        g.a(h < 13);
        return b[h];
    }

    public static Pair<Integer, Integer> c(u uVar, boolean z) {
        int h = uVar.h(5);
        if (h == 31) {
            h = uVar.h(6) + 32;
        }
        int b2 = b(uVar);
        int h2 = uVar.h(4);
        if (h == 5 || h == 29) {
            b2 = b(uVar);
            int h3 = uVar.h(5);
            if (h3 == 31) {
                h3 = uVar.h(6) + 32;
            }
            h = h3;
            if (h == 22) {
                h2 = uVar.h(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(h == 1 || h == 2 || h == 3 || h == 4 || h == 6 || h == 7 || h == 17)) {
                switch (h) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(je.p0("Unsupported audio object type: ", h));
                }
            }
            uVar.o(1);
            if (uVar.g()) {
                uVar.o(14);
            }
            boolean g = uVar.g();
            if (h2 != 0) {
                if (h == 6 || h == 20) {
                    uVar.o(3);
                }
                if (g) {
                    if (h == 22) {
                        uVar.o(16);
                    }
                    if (h == 17 || h == 19 || h == 20 || h == 23) {
                        uVar.o(3);
                    }
                    uVar.o(1);
                }
                switch (h) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h4 = uVar.h(2);
                        if (h4 == 2 || h4 == 3) {
                            throw new ParserException(je.p0("Unsupported epConfig: ", h4));
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = c[h2];
        if (i == -1) {
            z2 = false;
        }
        g.a(z2);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> d(byte[] bArr) {
        return c(new u(bArr), false);
    }
}
