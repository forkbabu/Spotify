package defpackage;

import defpackage.t1c;

/* renamed from: t0c  reason: default package */
public final class t0c implements fjf<t1c> {

    /* access modifiers changed from: private */
    /* renamed from: t0c$a */
    public static final class a {
        private static final t0c a = new t0c();
    }

    public static t0c a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        t1c.a.C0683a aVar = t1c.a.C0683a.b;
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
