package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.common.a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* renamed from: n30  reason: default package */
public final class n30 {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(Mode mode, a aVar, a aVar2, com.google.zxing.qrcode.decoder.a aVar3) {
        return aVar2.g() + mode.g(aVar3) + aVar.g();
    }

    private static com.google.zxing.qrcode.decoder.a b(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            com.google.zxing.qrcode.decoder.a e = com.google.zxing.qrcode.decoder.a.e(i2);
            if (e(i, e, errorCorrectionLevel)) {
                return e;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0130 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0121 A[LOOP:2: B:72:0x00f3->B:86:0x0121, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.q30 c(java.lang.String r23, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r24, java.util.Map<com.google.zxing.EncodeHintType, ?> r25) {
        /*
        // Method dump skipped, instructions count: 1355
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n30.c(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):q30");
    }

    static int d(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static boolean e(int i, com.google.zxing.qrcode.decoder.a aVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return aVar.d() - aVar.c(errorCorrectionLevel).d() >= (i + 7) / 8;
    }
}
