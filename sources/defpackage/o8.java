package defpackage;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: o8  reason: default package */
public final class o8 {
    static p8 a(Context context) {
        p8 p8Var;
        try {
            if (b(n8.h())) {
                p8Var = new n8(context);
            } else {
                p8Var = b(r8.h()) ? new r8(context) : null;
            }
            if (p8Var != null && p8Var.e()) {
                return p8Var;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean b(s8 s8Var) {
        return s8Var != null && s8.p.d() >= s8Var.d();
    }
}
