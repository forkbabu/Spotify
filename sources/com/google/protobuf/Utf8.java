package com.google.protobuf;

/* access modifiers changed from: package-private */
public final class Utf8 {
    private static final a a = (c0.g() && c0.h() ? new c() : new b());
    public static final /* synthetic */ int b = 0;

    /* access modifiers changed from: package-private */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super(je.s0("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* access modifiers changed from: package-private */
        public abstract int b(int i, byte[] bArr, int i2, int i3);
    }

    static final class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.Utf8.a
        public int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        @Override // com.google.protobuf.Utf8.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(int r12, byte[] r13, int r14, int r15) {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.b.b(int, byte[], int, int):int");
        }
    }

    static final class c extends a {
        c() {
        }

        private static int c(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                int i3 = Utf8.b;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i2 == 1) {
                return Utf8.a(i, c0.d(bArr, j));
            } else {
                if (i2 == 2) {
                    return Utf8.f(i, c0.d(bArr, j), c0.d(bArr, j + 1));
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.Utf8.a
        public int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            int i3;
            char charAt;
            long c2 = c0.c() + ((long) i);
            long j4 = ((long) i2) + c2;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                StringBuilder V0 = je.V0("Failed writing ");
                V0.append(charSequence.charAt(length - 1));
                V0.append(" at index ");
                V0.append(i + i2);
                throw new ArrayIndexOutOfBoundsException(V0.toString());
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                c0.i(bArr, c2, (byte) charAt);
                i4++;
                c2 = 1 + c2;
            }
            if (i4 == length) {
                j2 = c0.c();
            } else {
                while (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < c && c2 < j4) {
                        j3 = c2 + j;
                        c0.i(bArr, c2, (byte) charAt2);
                    } else if (charAt2 < 2048 && c2 <= j4 - 2) {
                        long j5 = c2 + j;
                        c0.i(bArr, c2, (byte) ((charAt2 >>> 6) | 960));
                        c0.i(bArr, j5, (byte) ((charAt2 & '?') | 128));
                        c2 = j5 + j;
                        i4++;
                        c = 128;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && c2 <= j4 - 3) {
                        long j6 = c2 + j;
                        c0.i(bArr, c2, (byte) ((charAt2 >>> '\f') | 480));
                        long j7 = j + j6;
                        c0.i(bArr, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 = j7 + 1;
                        c0.i(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        j = 1;
                    } else if (c2 <= j4 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j8 = c2 + 1;
                                c0.i(bArr, c2, (byte) ((codePoint >>> 18) | 240));
                                long j9 = 1 + j8;
                                c0.i(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = 1 + j9;
                                c0.i(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j = 1;
                                c0.i(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                c2 = j10 + 1;
                                i4++;
                                c = 128;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + c2);
                    } else {
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    c2 = j3;
                    i4++;
                    c = 128;
                }
                j2 = c0.c();
            }
            return (int) (c2 - j2);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
            if (com.google.protobuf.c0.d(r26, r8) > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
            if (com.google.protobuf.c0.d(r26, r8) > -65) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
            if (com.google.protobuf.c0.d(r26, r8) > -65) goto L_0x00ba;
         */
        @Override // com.google.protobuf.Utf8.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(int r25, byte[] r26, int r27, int r28) {
            /*
            // Method dump skipped, instructions count: 423
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.c.b(int, byte[], int, int):int");
        }
    }

    static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    static int c(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        int i4 = -1;
        if (i3 == 0) {
            if (b2 > -12) {
                b2 = -1;
            }
            return b2;
        } else if (i3 == 1) {
            byte b3 = bArr[i];
            if (b2 <= -12 && b3 <= -65) {
                i4 = b2 ^ (b3 << 8);
            }
            return i4;
        } else if (i3 == 2) {
            return f(b2, bArr[i], bArr[i + 1]);
        } else {
            throw new AssertionError();
        }
    }

    static int d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder V0 = je.V0("UTF-8 length does not fit in int: ");
        V0.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(V0.toString());
    }

    /* access modifiers changed from: private */
    public static int f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        if (a.b(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    public static int h(int i, byte[] bArr, int i2, int i3) {
        return a.b(i, bArr, i2, i3);
    }
}
