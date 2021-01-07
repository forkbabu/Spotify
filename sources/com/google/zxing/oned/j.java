package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import java.util.Map;

public final class j extends p {
    @Override // com.google.zxing.oned.m, com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.m
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = je.p0(str, o.b(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!o.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b = m.b(zArr, 0, o.a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b += m.b(zArr, b, o.d[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = b + m.b(zArr, b, o.b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += m.b(zArr, b2, o.d[Character.digit(str.charAt(i2), 10)], true);
        }
        m.b(zArr, b2, o.a, true);
        return zArr;
    }
}
