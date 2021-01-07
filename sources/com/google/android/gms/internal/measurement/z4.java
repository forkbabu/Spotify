package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class z4 implements a6 {
    private static final i5 b = new c5();
    private final i5 a;

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0027: APUT  
      (r1v1 com.google.android.gms.internal.measurement.i5[])
      (1 ??[boolean, int, float, short, byte, char])
      (r2v2 com.google.android.gms.internal.measurement.i5)
     */
    public z4() {
        i5 i5Var;
        i5[] i5VarArr = new i5[2];
        i5VarArr[0] = g4.c();
        try {
            i5Var = (i5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            i5Var = b;
        }
        i5VarArr[1] = i5Var;
        b5 b5Var = new b5(i5VarArr);
        Charset charset = h4.a;
        this.a = b5Var;
    }

    public final <T> y5<T> a(Class<T> cls) {
        z5.j(cls);
        j5 a2 = this.a.a(cls);
        if (!a2.b()) {
            boolean z = false;
            if (f4.class.isAssignableFrom(cls)) {
                if (a2.a() == 1) {
                    z = true;
                }
                if (z) {
                    return n5.n(a2, t5.b(), w4.c(), z5.w(), x3.a(), g5.b());
                }
                return n5.n(a2, t5.b(), w4.c(), z5.w(), null, g5.b());
            }
            if (a2.a() == 1) {
                z = true;
            }
            if (z) {
                return n5.n(a2, t5.a(), w4.a(), z5.e(), x3.b(), g5.a());
            }
            return n5.n(a2, t5.a(), w4.a(), z5.p(), null, g5.a());
        } else if (f4.class.isAssignableFrom(cls)) {
            return p5.j(z5.w(), x3.a(), a2.c());
        } else {
            return p5.j(z5.e(), x3.b(), a2.c());
        }
    }
}
