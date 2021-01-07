package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class u0 implements s1 {
    private static final c1 b = new w0();
    private final c1 a;

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0027: APUT  
      (r1v1 com.google.android.gms.internal.recaptcha.c1[])
      (1 ??[boolean, int, float, short, byte, char])
      (r2v2 com.google.android.gms.internal.recaptcha.c1)
     */
    public u0() {
        c1 c1Var;
        c1[] c1VarArr = new c1[2];
        c1VarArr[0] = h0.c();
        try {
            c1Var = (c1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            c1Var = b;
        }
        c1VarArr[1] = c1Var;
        v0 v0Var = new v0(c1VarArr);
        Charset charset = i0.a;
        this.a = v0Var;
    }

    public final <T> q1<T> a(Class<T> cls) {
        r1.c(cls);
        d1 a2 = this.a.a(cls);
        if (!a2.b()) {
            boolean z = false;
            if (g0.class.isAssignableFrom(cls)) {
                if (a2.a() == 1) {
                    z = true;
                }
                if (z) {
                    return i1.a(a2, l1.b(), r0.c(), r1.f(), d0.a(), a1.b());
                }
                return i1.a(a2, l1.b(), r0.c(), r1.f(), null, a1.b());
            }
            if (a2.a() == 1) {
                z = true;
            }
            if (z) {
                return i1.a(a2, l1.a(), r0.a(), r1.a(), d0.b(), a1.a());
            }
            return i1.a(a2, l1.a(), r0.a(), r1.e(), null, a1.a());
        } else if (g0.class.isAssignableFrom(cls)) {
            return h1.a(r1.f(), d0.a(), a2.c());
        } else {
            return h1.a(r1.a(), d0.b(), a2.c());
        }
    }
}
