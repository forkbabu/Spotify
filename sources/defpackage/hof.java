package defpackage;

import okhttp3.u;

/* renamed from: hof  reason: default package */
public final class hof {
    public static String a(u uVar) {
        String f = uVar.f();
        String h = uVar.h();
        if (h == null) {
            return f;
        }
        return f + '?' + h;
    }
}
