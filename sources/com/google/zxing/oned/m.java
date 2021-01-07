package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.common.b;
import java.util.Map;

public abstract class m implements c {
    protected static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    @Override // com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int d = d();
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType)) {
                    d = Integer.parseInt(map.get(encodeHintType).toString());
                }
            }
            boolean[] c = c(str);
            int length = c.length;
            int i3 = d + length;
            int max = Math.max(i, i3);
            int max2 = Math.max(1, i2);
            int i4 = max / i3;
            int i5 = (max - (length * i4)) / 2;
            b bVar = new b(max, max2);
            int i6 = 0;
            while (i6 < length) {
                if (c[i6]) {
                    bVar.g(i5, 0, i4, max2);
                }
                i6++;
                i5 += i4;
            }
            return bVar;
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
