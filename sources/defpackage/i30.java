package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.datamatrix.encoder.e;
import com.google.zxing.datamatrix.encoder.i;
import com.google.zxing.datamatrix.encoder.j;
import com.google.zxing.datamatrix.encoder.k;
import java.util.Map;

/* renamed from: i30  reason: default package */
public final class i30 implements c {
    @Override // com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        a aVar;
        b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            a aVar2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                a aVar3 = (a) map.get(EncodeHintType.MIN_SIZE);
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar = (a) map.get(EncodeHintType.MAX_SIZE);
                if (aVar == null) {
                    aVar = null;
                }
                aVar2 = aVar3;
            } else {
                aVar = null;
            }
            String a = j.a(str, symbolShapeHint, aVar2, aVar);
            k l = k.l(a.length(), symbolShapeHint, aVar2, aVar, true);
            e eVar = new e(i.b(a, l), l.h(), l.g());
            eVar.d();
            int h = l.h();
            int g = l.g();
            m30 m30 = new m30(l.j(), l.i());
            int i3 = 0;
            for (int i4 = 0; i4 < g; i4++) {
                if (i4 % l.e == 0) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < l.j(); i6++) {
                        m30.g(i5, i3, i6 % 2 == 0);
                        i5++;
                    }
                    i3++;
                }
                int i7 = 0;
                for (int i8 = 0; i8 < h; i8++) {
                    if (i8 % l.d == 0) {
                        m30.g(i7, i3, true);
                        i7++;
                    }
                    m30.g(i7, i3, eVar.a(i8, i4));
                    i7++;
                    int i9 = l.d;
                    if (i8 % i9 == i9 - 1) {
                        m30.g(i7, i3, i4 % 2 == 0);
                        i7++;
                    }
                }
                i3++;
                int i10 = l.e;
                if (i4 % i10 == i10 - 1) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < l.j(); i12++) {
                        m30.g(i11, i3, true);
                        i11++;
                    }
                    i3++;
                }
            }
            int e = m30.e();
            int d = m30.d();
            int max = Math.max(i, e);
            int max2 = Math.max(i2, d);
            int min = Math.min(max / e, max2 / d);
            int i13 = (max - (e * min)) / 2;
            int i14 = (max2 - (d * min)) / 2;
            if (i2 < d || i < e) {
                bVar = new b(e, d);
                i13 = 0;
                i14 = 0;
            } else {
                bVar = new b(i, i2);
            }
            bVar.b();
            int i15 = 0;
            while (i15 < d) {
                int i16 = i13;
                int i17 = 0;
                while (i17 < e) {
                    if (m30.b(i17, i15) == 1) {
                        bVar.g(i16, i14, min, min);
                    }
                    i17++;
                    i16 += min;
                }
                i15++;
                i14 += min;
            }
            return bVar;
        }
    }
}
