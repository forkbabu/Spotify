package com.facebook.appevents.ml;

/* access modifiers changed from: package-private */
public final class b {
    b() {
    }

    static void a(a aVar, a aVar2) {
        if (!uf.c(b.class)) {
            try {
                int b = aVar.b(0);
                int b2 = aVar.b(1);
                int b3 = aVar.b(2);
                float[] a = aVar.a();
                float[] a2 = aVar2.a();
                for (int i = 0; i < b; i++) {
                    for (int i2 = 0; i2 < b2; i2++) {
                        for (int i3 = 0; i3 < b3; i3++) {
                            int V = je.V(i2, b3, i * b2 * b3, i3);
                            a[V] = a[V] + a2[i3];
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, b.class);
            }
        }
    }

    static a b(a[] aVarArr) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVarArr[0].b(0);
            int i = 0;
            for (a aVar : aVarArr) {
                i += aVar.b(1);
            }
            a aVar2 = new a(new int[]{b, i});
            float[] a = aVar2.a();
            for (int i2 = 0; i2 < b; i2++) {
                int i3 = i2 * i;
                for (int i4 = 0; i4 < aVarArr.length; i4++) {
                    float[] a2 = aVarArr[i4].a();
                    int b2 = aVarArr[i4].b(1);
                    System.arraycopy(a2, i2 * b2, a, i3, b2);
                    i3 += b2;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static a c(a aVar, a aVar2) {
        if (uf.c(b.class)) {
            return null;
        }
        int i = 0;
        try {
            int b = aVar.b(0);
            int b2 = aVar.b(1);
            int b3 = aVar.b(2);
            int b4 = aVar2.b(0);
            int i2 = (b2 - b4) + 1;
            int b5 = aVar2.b(2);
            a aVar3 = new a(new int[]{b, i2, b5});
            float[] a = aVar.a();
            float[] a2 = aVar3.a();
            float[] a3 = aVar2.a();
            int i3 = 0;
            while (i3 < b) {
                int i4 = 0;
                while (i4 < b5) {
                    int i5 = 0;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < b4) {
                            for (int i6 = 0; i6 < b3; i6++) {
                                f = (a[((i + i5) * b3) + (b2 * b3 * i3) + i6] * a3[(((i * b3) + i6) * b5) + i4]) + f;
                            }
                            i++;
                            b = b;
                        }
                        a2[je.V(i5, b5, i2 * b5 * i3, i4)] = f;
                        i5++;
                        i = 0;
                        b = b;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static a d(a aVar, a aVar2, a aVar3) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVar.b(0);
            int b2 = aVar3.b(0);
            a h = h(aVar, aVar2);
            float[] a = aVar3.a();
            float[] a2 = h.a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    int i3 = (i * b2) + i2;
                    a2[i3] = a2[i3] + a[i2];
                }
            }
            return h;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static a e(String[] strArr, int i, a aVar) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int b = aVar.b(1);
            a aVar2 = new a(new int[]{length, i, b});
            float[] a = aVar2.a();
            float[] a2 = aVar.a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] b2 = c.b(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(a2, b2[i3] * b, a, (b * i3) + (b * i * i2), b);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static void f(a aVar, int i) {
        if (!uf.c(b.class)) {
            try {
                if (i < aVar.c()) {
                    int i2 = 1;
                    for (int i3 = i; i3 < aVar.c(); i3++) {
                        i2 *= aVar.b(i3);
                    }
                    int[] iArr = new int[(i + 1)];
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr[i4] = aVar.b(i4);
                    }
                    iArr[i] = i2;
                    aVar.d(iArr);
                }
            } catch (Throwable th) {
                uf.b(th, b.class);
            }
        }
    }

    static a g(a aVar, int i) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVar.b(0);
            int b2 = aVar.b(1);
            int b3 = aVar.b(2);
            int i2 = (b2 - i) + 1;
            a aVar2 = new a(new int[]{b, i2, b3});
            float[] a = aVar.a();
            float[] a2 = aVar2.a();
            for (int i3 = 0; i3 < b; i3++) {
                for (int i4 = 0; i4 < b3; i4++) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        int i6 = i5 * b3;
                        int i7 = (i3 * i2 * b3) + i6 + i4;
                        int i8 = (i3 * b2 * b3) + i6 + i4;
                        a2[i7] = Float.MIN_VALUE;
                        for (int i9 = 0; i9 < i; i9++) {
                            a2[i7] = Math.max(a2[i7], a[(i9 * b3) + i8]);
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static a h(a aVar, a aVar2) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVar.b(0);
            int b2 = aVar2.b(0);
            int b3 = aVar2.b(1);
            a aVar3 = new a(new int[]{b, b3});
            float[] a = aVar.a();
            float[] a2 = aVar2.a();
            float[] a3 = aVar3.a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b3; i2++) {
                    int i3 = (i * b3) + i2;
                    a3[i3] = 0.0f;
                    for (int i4 = 0; i4 < b2; i4++) {
                        a3[i3] = (a[(i * b2) + i4] * a2[(i4 * b3) + i2]) + a3[i3];
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static void i(a aVar) {
        if (!uf.c(b.class)) {
            try {
                float[] a = aVar.a();
                for (int i = 0; i < a.length; i++) {
                    if (a[i] < 0.0f) {
                        a[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                uf.b(th, b.class);
            }
        }
    }

    static a j(a aVar) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVar.b(0);
            int b2 = aVar.b(1);
            a aVar2 = new a(new int[]{b2, b});
            float[] a = aVar.a();
            float[] a2 = aVar2.a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    a2[(i2 * b) + i] = a[(i * b2) + i2];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }

    static a k(a aVar) {
        if (uf.c(b.class)) {
            return null;
        }
        try {
            int b = aVar.b(0);
            int b2 = aVar.b(1);
            int b3 = aVar.b(2);
            a aVar2 = new a(new int[]{b3, b2, b});
            float[] a = aVar.a();
            float[] a2 = aVar2.a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    for (int i3 = 0; i3 < b3; i3++) {
                        a2[je.V(i2, b, i3 * b * b2, i)] = a[(i2 * b3) + (i * b2 * b3) + i3];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            uf.b(th, b.class);
            return null;
        }
    }
}
