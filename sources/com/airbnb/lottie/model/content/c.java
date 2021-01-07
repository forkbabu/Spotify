package com.airbnb.lottie.model.content;

public class c {
    private final float[] a;
    private final int[] b;

    public c(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(c cVar, c cVar2, float f) {
        if (cVar.b.length == cVar2.b.length) {
            for (int i = 0; i < cVar.b.length; i++) {
                this.a[i] = de.f(cVar.a[i], cVar2.a[i], f);
                this.b[i] = yd.c(f, cVar.b[i], cVar2.b[i]);
            }
            return;
        }
        StringBuilder V0 = je.V0("Cannot interpolate between gradients. Lengths vary (");
        V0.append(cVar.b.length);
        V0.append(" vs ");
        throw new IllegalArgumentException(je.B0(V0, cVar2.b.length, ")"));
    }
}
