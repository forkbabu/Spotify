package com.google.zxing;

import com.google.zxing.oned.Code128Writer;
import com.google.zxing.oned.e;
import com.google.zxing.oned.g;
import com.google.zxing.oned.i;
import com.google.zxing.oned.j;
import com.google.zxing.oned.k;
import com.google.zxing.oned.n;
import com.google.zxing.oned.r;
import java.util.Map;

public final class b implements c {
    @Override // com.google.zxing.c
    public com.google.zxing.common.b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        c cVar;
        switch (barcodeFormat.ordinal()) {
            case 0:
                cVar = new a30();
                break;
            case 1:
                cVar = new com.google.zxing.oned.b();
                break;
            case 2:
                cVar = new e();
                break;
            case 3:
                cVar = new g();
                break;
            case 4:
                cVar = new Code128Writer();
                break;
            case 5:
                cVar = new i30();
                break;
            case 6:
                cVar = new j();
                break;
            case 7:
                cVar = new i();
                break;
            case 8:
                cVar = new k();
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
            case 10:
                cVar = new j30();
                break;
            case 11:
                cVar = new k30();
                break;
            case 14:
                cVar = new n();
                break;
            case 15:
                cVar = new r();
                break;
        }
        return cVar.a(str, barcodeFormat, i, i2, map);
    }
}
