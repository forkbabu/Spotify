package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;
import java.util.List;

public final class l {
    public final List<byte[]> a;
    public final int b;

    private l(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static l a(v vVar) {
        List list;
        try {
            vVar.L(21);
            int x = vVar.x() & 3;
            int x2 = vVar.x();
            int b2 = vVar.b();
            int i = 0;
            for (int i2 = 0; i2 < x2; i2++) {
                vVar.L(1);
                int D = vVar.D();
                for (int i3 = 0; i3 < D; i3++) {
                    int D2 = vVar.D();
                    i += D2 + 4;
                    vVar.L(D2);
                }
            }
            vVar.K(b2);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < x2; i5++) {
                vVar.L(1);
                int D3 = vVar.D();
                for (int i6 = 0; i6 < D3; i6++) {
                    int D4 = vVar.D();
                    byte[] bArr2 = t.a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(vVar.a, vVar.b(), bArr, length, D4);
                    i4 = length + D4;
                    vVar.L(D4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new l(list, x + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
