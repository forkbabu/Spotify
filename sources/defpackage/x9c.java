package defpackage;

import com.spotify.ubi.specification.factories.z3;

/* renamed from: x9c  reason: default package */
public final class x9c implements fjf<z3> {

    /* access modifiers changed from: private */
    /* renamed from: x9c$a */
    public static final class a {
        private static final x9c a = new x9c();
    }

    public static x9c a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z3();
    }
}
