package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.b;
import java.util.Map;

public final class Code128Writer extends m {

    /* access modifiers changed from: private */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static CType e(CharSequence charSequence, int i) {
        char charAt;
        CType cType = CType.ONE_DIGIT;
        CType cType2 = CType.UNCODABLE;
        int length = charSequence.length();
        if (i >= length) {
            return cType2;
        }
        char charAt2 = charSequence.charAt(i);
        if (charAt2 == 241) {
            return CType.FNC_1;
        }
        if (charAt2 < '0' || charAt2 > '9') {
            return cType2;
        }
        int i2 = i + 1;
        return (i2 < length && (charAt = charSequence.charAt(i2)) >= '0' && charAt <= '9') ? CType.TWO_DIGITS : cType;
    }

    @Override // com.google.zxing.oned.m, com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (e(r17, r6 + 3) == r13) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        if (r5 == r12) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (r14 == r13) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0038 A[SYNTHETIC] */
    @Override // com.google.zxing.oned.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] c(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.c(java.lang.String):boolean[]");
    }
}
