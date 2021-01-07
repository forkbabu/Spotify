package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* renamed from: k30  reason: default package */
public final class k30 implements c {
    @Override // com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(encodeHintType)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
                }
                EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType2)) {
                    i3 = Integer.parseInt(map.get(encodeHintType2).toString());
                }
            }
            m30 a = n30.c(str, errorCorrectionLevel, map).a();
            if (a != null) {
                int e = a.e();
                int d = a.d();
                int i4 = i3 << 1;
                int i5 = e + i4;
                int i6 = i4 + d;
                int max = Math.max(i, i5);
                int max2 = Math.max(i2, i6);
                int min = Math.min(max / i5, max2 / i6);
                int i7 = (max - (e * min)) / 2;
                int i8 = (max2 - (d * min)) / 2;
                b bVar = new b(max, max2);
                int i9 = 0;
                while (i9 < d) {
                    int i10 = i7;
                    int i11 = 0;
                    while (i11 < e) {
                        if (a.b(i11, i9) == 1) {
                            bVar.g(i10, i8, min, min);
                        }
                        i11++;
                        i10 += min;
                    }
                    i9++;
                    i8 += min;
                }
                return bVar;
            }
            throw new IllegalStateException();
        }
    }
}
