package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class n6 implements p7 {
    private static final w6 b = new q6();
    private final w6 a;

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0027: APUT  
      (r1v1 com.google.android.gms.internal.cast.w6[])
      (1 ??[boolean, int, float, short, byte, char])
      (r2v2 com.google.android.gms.internal.cast.w6)
     */
    public n6() {
        w6 w6Var;
        w6[] w6VarArr = new w6[2];
        w6VarArr[0] = s5.c();
        try {
            w6Var = (w6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            w6Var = b;
        }
        w6VarArr[1] = w6Var;
        p6 p6Var = new p6(w6VarArr);
        Charset charset = v5.a;
        this.a = p6Var;
    }

    public final <T> m7<T> a(Class<T> cls) {
        o7.r(cls);
        x6 b2 = this.a.b(cls);
        if (!b2.a()) {
            boolean z = false;
            if (r5.class.isAssignableFrom(cls)) {
                if (b2.c() == 1) {
                    z = true;
                }
                if (z) {
                    return c7.h(b2, f7.b(), j6.d(), o7.G(), k5.a(), u6.b());
                }
                return c7.h(b2, f7.b(), j6.d(), o7.G(), null, u6.b());
            }
            if (b2.c() == 1) {
                z = true;
            }
            if (z) {
                return c7.h(b2, f7.a(), j6.c(), o7.E(), k5.b(), u6.a());
            }
            return c7.h(b2, f7.a(), j6.c(), o7.F(), null, u6.a());
        } else if (r5.class.isAssignableFrom(cls)) {
            return b7.h(o7.G(), k5.a(), b2.b());
        } else {
            return b7.h(o7.E(), k5.b(), b2.b());
        }
    }
}
