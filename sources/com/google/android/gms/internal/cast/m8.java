package com.google.android.gms.internal.cast;

final class m8 extends l8 {
    m8() {
    }

    private static int c(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            int i3 = j8.b;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            byte a = f8.a(bArr, j);
            int i4 = j8.b;
            if (i > -12 || a > -65) {
                return -1;
            }
            return i ^ (a << 8);
        } else if (i2 == 2) {
            return j8.f(i, f8.a(bArr, j), f8.a(bArr, j + 1));
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
    @Override // com.google.android.gms.internal.cast.l8
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r16, byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.m8.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.l8
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
            f8.i(bArr, j4, (byte) charAt);
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
                f8.i(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j6;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j7 = j4 + j;
                f8.i(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                f8.i(bArr, j7, (byte) ((charAt3 & '?') | 128));
                j2 = j7 + j;
                j3 = j;
                i4++;
                c = 128;
                j4 = j2;
                j = j3;
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j4 <= j5 - 3) {
                long j8 = j4 + j;
                f8.i(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                long j9 = j8 + j;
                f8.i(bArr, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                f8.i(bArr, j9, (byte) ((charAt3 & '?') | 128));
                j2 = j9 + 1;
                j3 = 1;
            } else if (j4 <= j5 - 4) {
                int i5 = i4 + 1;
                if (i5 != length) {
                    char charAt4 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j10 = j4 + 1;
                        f8.i(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                        long j11 = j10 + 1;
                        f8.i(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j12 = j11 + 1;
                        f8.i(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j12 + 1;
                        f8.i(bArr, j12, (byte) ((codePoint & 63) | 128));
                        i4 = i5;
                        i4++;
                        c = 128;
                        j4 = j2;
                        j = j3;
                    } else {
                        i4 = i5;
                    }
                }
                throw new zzpg(i4 - 1, length);
            } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed writing ");
                sb2.append(charAt3);
                sb2.append(" at index ");
                sb2.append(j4);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            } else {
                throw new zzpg(i4, length);
            }
            i4++;
            c = 128;
            j4 = j2;
            j = j3;
        }
        return (int) j4;
    }
}
