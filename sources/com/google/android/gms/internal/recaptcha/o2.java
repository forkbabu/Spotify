package com.google.android.gms.internal.recaptcha;

final class o2 extends n2 {
    o2() {
    }

    private static int b(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            int i3 = l2.b;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            byte a = k2.a(bArr, j);
            int i4 = l2.b;
            if (i > -12 || a > -65) {
                return -1;
            }
            return i ^ (a << 8);
        } else if (i2 == 2) {
            return l2.a(i, k2.a(bArr, j), k2.a(bArr, j + 1));
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
    @Override // com.google.android.gms.internal.recaptcha.n2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r16, byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.o2.a(int, byte[], int, int):int");
    }
}
