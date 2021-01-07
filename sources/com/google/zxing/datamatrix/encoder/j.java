package com.google.zxing.datamatrix.encoder;

import com.google.zxing.a;
import java.util.Arrays;

public final class j {
    public static String a(String str, SymbolShapeHint symbolShapeHint, a aVar, a aVar2) {
        int i = 0;
        g[] gVarArr = {new a(), new c(), new l(), new m(), new f(), new b()};
        h hVar = new h(str);
        hVar.m(symbolShapeHint);
        hVar.k(aVar, aVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.q(236);
            hVar.l(2);
            hVar.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.q(237);
            hVar.l(2);
            hVar.f += 7;
        }
        while (hVar.h()) {
            gVarArr[i].a(hVar);
            if (hVar.e() >= 0) {
                i = hVar.e();
                hVar.i();
            }
        }
        int a = hVar.a();
        hVar.o();
        int a2 = hVar.g().a();
        if (!(a >= a2 || i == 0 || i == 5 || i == 4)) {
            hVar.q(254);
        }
        StringBuilder b = hVar.b();
        if (b.length() < a2) {
            b.append((char) 129);
        }
        while (b.length() < a2) {
            int length = (((b.length() + 1) * 149) % 253) + 1 + 129;
            if (length > 254) {
                length -= 254;
            }
            b.append((char) length);
        }
        return hVar.b().toString();
    }

    private static int b(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    static void c(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean d(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean e(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean f(char c) {
        if (g(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean g(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    static int h(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int b = b(fArr, iArr, Integer.MAX_VALUE, bArr);
                int i5 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    i5 += bArr[i6];
                }
                if (iArr[0] == b) {
                    return 0;
                }
                if (i5 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i5 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i5 != 1 || bArr[2] <= 0) {
                    return (i5 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (d(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (e(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (e(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (e(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (f(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (e(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (e(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                b(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int i7 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    i7 += bArr2[i8];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i7 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i7 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i7 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i9 = i + i3 + 1; i9 < charSequence.length(); i9++) {
                            char charAt2 = charSequence.charAt(i9);
                            if (g(charAt2)) {
                                return 3;
                            }
                            if (!f(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }
}
