package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: o2  reason: default package */
public final class o2 {
    final int[] a;
    final float[] b;

    o2(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = list.get(i).intValue();
            this.b[i] = list2.get(i).floatValue();
        }
    }

    o2(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    o2(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
