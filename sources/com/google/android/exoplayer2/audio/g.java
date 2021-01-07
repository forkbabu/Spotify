package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

public final class g {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        b(String str, int i, int i2, int i3, int i4, int i5, a aVar) {
            this.a = str;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static d0 b(v vVar, String str, String str2, l lVar) {
        int i = b[(vVar.x() & 192) >> 6];
        int x = vVar.x();
        int i2 = d[(x & 56) >> 3];
        if ((x & 4) != 0) {
            i2++;
        }
        return d0.o(str, "audio/ac3", null, -1, -1, i2, i, null, lVar, 0, str2);
    }

    public static b c(u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = d;
        int[] iArr2 = b;
        int e2 = uVar.e();
        uVar.o(40);
        boolean z = uVar.h(5) == 16;
        uVar.m(e2);
        int i13 = -1;
        if (z) {
            uVar.o(16);
            int h = uVar.h(2);
            if (h == 0) {
                i13 = 0;
            } else if (h == 1) {
                i13 = 1;
            } else if (h == 2) {
                i13 = 2;
            }
            uVar.o(3);
            int h2 = (uVar.h(11) + 1) * 2;
            int h3 = uVar.h(2);
            if (h3 == 3) {
                i8 = c[uVar.h(2)];
                i7 = 3;
                i6 = 6;
            } else {
                i7 = uVar.h(2);
                i6 = a[i7];
                i8 = iArr2[h3];
            }
            int i14 = i6 * 256;
            int h4 = uVar.h(3);
            boolean g = uVar.g();
            int i15 = iArr[h4] + (g ? 1 : 0);
            uVar.o(10);
            if (uVar.g()) {
                uVar.o(8);
            }
            if (h4 == 0) {
                uVar.o(5);
                if (uVar.g()) {
                    uVar.o(8);
                }
            }
            if (i13 == 1 && uVar.g()) {
                uVar.o(16);
            }
            if (uVar.g()) {
                if (h4 > 2) {
                    uVar.o(2);
                }
                if ((h4 & 1) == 0 || h4 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    uVar.o(6);
                }
                if ((h4 & 4) != 0) {
                    uVar.o(i11);
                }
                if (g && uVar.g()) {
                    uVar.o(5);
                }
                if (i13 == 0) {
                    if (uVar.g()) {
                        i12 = 6;
                        uVar.o(6);
                    } else {
                        i12 = 6;
                    }
                    if (h4 == 0 && uVar.g()) {
                        uVar.o(i12);
                    }
                    if (uVar.g()) {
                        uVar.o(i12);
                    }
                    int h5 = uVar.h(2);
                    if (h5 == 1) {
                        uVar.o(5);
                    } else if (h5 == 2) {
                        uVar.o(12);
                    } else if (h5 == 3) {
                        int h6 = uVar.h(5);
                        if (uVar.g()) {
                            uVar.o(5);
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                uVar.o(4);
                            }
                            if (uVar.g()) {
                                if (uVar.g()) {
                                    uVar.o(4);
                                }
                                if (uVar.g()) {
                                    uVar.o(4);
                                }
                            }
                        }
                        if (uVar.g()) {
                            uVar.o(5);
                            if (uVar.g()) {
                                uVar.o(7);
                                if (uVar.g()) {
                                    uVar.o(8);
                                }
                            }
                        }
                        uVar.o((h6 + 2) * 8);
                        uVar.c();
                    }
                    if (h4 < 2) {
                        if (uVar.g()) {
                            uVar.o(14);
                        }
                        if (h4 == 0 && uVar.g()) {
                            uVar.o(14);
                        }
                    }
                    if (uVar.g()) {
                        if (i7 == 0) {
                            uVar.o(5);
                        } else {
                            for (int i16 = 0; i16 < i6; i16++) {
                                if (uVar.g()) {
                                    uVar.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (uVar.g()) {
                uVar.o(5);
                if (h4 == 2) {
                    uVar.o(4);
                }
                if (h4 >= 6) {
                    uVar.o(2);
                }
                if (uVar.g()) {
                    uVar.o(8);
                }
                if (h4 == 0 && uVar.g()) {
                    uVar.o(8);
                }
                i9 = 3;
                if (h3 < 3) {
                    uVar.n();
                }
            } else {
                i9 = 3;
            }
            if (i13 == 0 && i7 != i9) {
                uVar.n();
            }
            if (i13 != 2 || (i7 != i9 && !uVar.g())) {
                i10 = 6;
            } else {
                i10 = 6;
                uVar.o(6);
            }
            str = (uVar.g() && uVar.h(i10) == 1 && uVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i15;
            i3 = i8;
            i5 = i13;
            i2 = h2;
            i = i14;
        } else {
            uVar.o(32);
            int h7 = uVar.h(2);
            String str2 = h7 == 3 ? null : "audio/ac3";
            int a2 = a(h7, uVar.h(6));
            uVar.o(8);
            int h8 = uVar.h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                uVar.o(2);
            }
            if ((h8 & 4) != 0) {
                uVar.o(2);
            }
            if (h8 == 2) {
                uVar.o(2);
            }
            int i17 = h7 < iArr2.length ? iArr2[h7] : -1;
            i4 = iArr[h8] + (uVar.g() ? 1 : 0);
            i3 = i17;
            str = str2;
            i2 = a2;
            i5 = -1;
            i = 1536;
        }
        return new b(str, i5, i4, i3, i2, i, null);
    }

    public static int d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 255) >> 3) == 16)) {
            return a((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static d0 e(v vVar, String str, String str2, l lVar) {
        vVar.L(2);
        int i = b[(vVar.x() & 192) >> 6];
        int x = vVar.x();
        int i2 = d[(x & 14) >> 1];
        if ((x & 1) != 0) {
            i2++;
        }
        if (((vVar.x() & 30) >> 1) > 0 && (2 & vVar.x()) != 0) {
            i2 += 2;
        }
        return d0.o(str, (vVar.a() <= 0 || (vVar.x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i2, i, null, lVar, 0, str2);
    }

    public static int f(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
