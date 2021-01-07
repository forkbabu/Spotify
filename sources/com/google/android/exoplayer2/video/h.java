package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.j;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.List;

public final class h {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static h a(v vVar) {
        float f;
        int i;
        int i2;
        try {
            vVar.L(4);
            int x = (vVar.x() & 3) + 1;
            if (x != 3) {
                ArrayList arrayList = new ArrayList();
                int x2 = vVar.x() & 31;
                for (int i3 = 0; i3 < x2; i3++) {
                    int D = vVar.D();
                    int b2 = vVar.b();
                    vVar.L(D);
                    arrayList.add(j.a(vVar.a, b2, D));
                }
                int x3 = vVar.x();
                for (int i4 = 0; i4 < x3; i4++) {
                    int D2 = vVar.D();
                    int b3 = vVar.b();
                    vVar.L(D2);
                    arrayList.add(j.a(vVar.a, b3, D2));
                }
                if (x2 > 0) {
                    t.b d2 = t.d((byte[]) arrayList.get(0), x, ((byte[]) arrayList.get(0)).length);
                    int i5 = d2.e;
                    int i6 = d2.f;
                    f = d2.g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new h(arrayList, x, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing AVC config", e2);
        }
    }
}
