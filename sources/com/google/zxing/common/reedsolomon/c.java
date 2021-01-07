package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

public final class c {
    private final a a;
    private final List<b> b;

    public c(a aVar) {
        this.a = aVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                if (i >= this.b.size()) {
                    List<b> list = this.b;
                    b bVar = list.get(list.size() - 1);
                    for (int size = this.b.size(); size <= i; size++) {
                        a aVar = this.a;
                        bVar = bVar.g(new b(aVar, new int[]{1, aVar.b(aVar.c() + (size - 1))}));
                        this.b.add(bVar);
                    }
                }
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d = new b(this.a, iArr2).h(i, 1).b(this.b.get(i))[1].d();
                int length2 = i - d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(d, 0, iArr, length + length2, d.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
