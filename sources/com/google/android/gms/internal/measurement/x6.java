package com.google.android.gms.internal.measurement;

final class x6 extends u6 {
    x6() {
    }

    private static int d(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            int i3 = t6.b;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            byte a = q6.a(bArr, j);
            int i4 = t6.b;
            if (i > -12 || a > -65) {
                return -1;
            }
            return i ^ (a << 8);
        } else if (i2 == 2) {
            return t6.f(i, q6.a(bArr, j), q6.a(bArr, j + 1));
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.u6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r16, byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x6.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.u6
    public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = (long) i;
        long j5 = ((long) i2) + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            q6.k(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < c && j4 < j5) {
                long j6 = j4 + j;
                q6.k(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j6;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j7 = j4 + j;
                q6.k(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                q6.k(bArr, j7, (byte) ((charAt3 & '?') | 128));
                j2 = j7 + j;
                j3 = j;
                i4++;
                c = 128;
                j4 = j2;
                j = j3;
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j4 <= j5 - 3) {
                long j8 = j4 + j;
                q6.k(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                long j9 = j8 + j;
                q6.k(bArr, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                q6.k(bArr, j9, (byte) ((charAt3 & '?') | 128));
                j2 = j9 + 1;
                j3 = 1;
            } else if (j4 <= j5 - 4) {
                int i5 = i4 + 1;
                if (i5 != length) {
                    char charAt4 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j10 = j4 + 1;
                        q6.k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                        long j11 = j10 + 1;
                        q6.k(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j12 = j11 + 1;
                        q6.k(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j12 + 1;
                        q6.k(bArr, j12, (byte) ((codePoint & 63) | 128));
                        i4 = i5;
                        i4++;
                        c = 128;
                        j4 = j2;
                        j = j3;
                    } else {
                        i4 = i5;
                    }
                }
                throw new zzkz(i4 - 1, length);
            } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed writing ");
                sb2.append(charAt3);
                sb2.append(" at index ");
                sb2.append(j4);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            } else {
                throw new zzkz(i4, length);
            }
            i4++;
            c = 128;
            j4 = j2;
            j = j3;
        }
        return (int) j4;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.u6
    public final String c(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a = q6.a(bArr, (long) i);
                if (!o2.t(a)) {
                    break;
                }
                i++;
                cArr[i4] = (char) a;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte a2 = q6.a(bArr, (long) i);
                if (o2.t(a2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) a2;
                    i = i6;
                    while (true) {
                        i5 = i7;
                        if (i >= i3) {
                            break;
                        }
                        byte a3 = q6.a(bArr, (long) i);
                        if (!o2.t(a3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) a3;
                    }
                } else {
                    if (!(a2 < -32)) {
                        if (a2 < -16) {
                            if (i6 < i3 - 1) {
                                int i8 = i6 + 1;
                                o2.p(a2, q6.a(bArr, (long) i6), q6.a(bArr, (long) i8), cArr, i5);
                                i = i8 + 1;
                                i5++;
                            } else {
                                throw zzig.e();
                            }
                        } else if (i6 < i3 - 2) {
                            int i9 = i6 + 1;
                            int i10 = i9 + 1;
                            o2.o(a2, q6.a(bArr, (long) i6), q6.a(bArr, (long) i9), q6.a(bArr, (long) i10), cArr, i5);
                            i5 = i5 + 1 + 1;
                            i = i10 + 1;
                        } else {
                            throw zzig.e();
                        }
                    } else if (i6 < i3) {
                        o2.q(a2, q6.a(bArr, (long) i6), cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw zzig.e();
                    }
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
