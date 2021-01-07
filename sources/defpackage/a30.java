package defpackage;

import com.google.zxing.c;

/* renamed from: a30  reason: default package */
public final class a30 implements c {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    @Override // com.google.zxing.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.b a(java.lang.String r8, com.google.zxing.BarcodeFormat r9, int r10, int r11, java.util.Map<com.google.zxing.EncodeHintType, ?> r12) {
        /*
            r7 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            r1 = 0
            r2 = 33
            if (r12 == 0) goto L_0x0044
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r4 = r12.containsKey(r3)
            if (r4 == 0) goto L_0x001b
            java.lang.Object r0 = r12.get(r3)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
        L_0x001b:
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r4 = r12.containsKey(r3)
            if (r4 == 0) goto L_0x002f
            java.lang.Object r2 = r12.get(r3)
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L_0x002f:
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.AZTEC_LAYERS
            boolean r4 = r12.containsKey(r3)
            if (r4 == 0) goto L_0x0044
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = r12.toString()
            int r12 = java.lang.Integer.parseInt(r12)
            goto L_0x0045
        L_0x0044:
            r12 = 0
        L_0x0045:
            com.google.zxing.BarcodeFormat r3 = com.google.zxing.BarcodeFormat.AZTEC
            if (r9 != r3) goto L_0x009f
            byte[] r8 = r8.getBytes(r0)
            b30 r8 = defpackage.d30.b(r8, r2, r12)
            com.google.zxing.common.b r8 = r8.a()
            if (r8 == 0) goto L_0x0099
            int r9 = r8.e()
            int r12 = r8.d()
            int r10 = java.lang.Math.max(r10, r9)
            int r11 = java.lang.Math.max(r11, r12)
            int r0 = r10 / r9
            int r2 = r11 / r12
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r9 * r0
            int r2 = r10 - r2
            int r2 = r2 / 2
            int r3 = r12 * r0
            int r3 = r11 - r3
            int r3 = r3 / 2
            com.google.zxing.common.b r4 = new com.google.zxing.common.b
            r4.<init>(r10, r11)
            r10 = 0
        L_0x0081:
            if (r10 >= r12) goto L_0x0098
            r5 = r2
            r11 = 0
        L_0x0085:
            if (r11 >= r9) goto L_0x0094
            boolean r6 = r8.c(r11, r10)
            if (r6 == 0) goto L_0x0090
            r4.g(r5, r3, r0, r0)
        L_0x0090:
            int r11 = r11 + 1
            int r5 = r5 + r0
            goto L_0x0085
        L_0x0094:
            int r10 = r10 + 1
            int r3 = r3 + r0
            goto L_0x0081
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x009f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Can only encode AZTEC, but got "
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            goto L_0x00b0
        L_0x00af:
            throw r8
        L_0x00b0:
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.a(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):com.google.zxing.common.b");
    }
}
