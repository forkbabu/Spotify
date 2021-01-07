package defpackage;

import com.spotify.rcs.model.proto.Platform;
import defpackage.x2a;

/* renamed from: yn5  reason: default package */
public final class yn5 implements fjf<x2a> {
    private final wlf<e0e> a;

    public yn5(wlf<e0e> wlf) {
        this.a = wlf;
    }

    public static x2a a(e0e e0e) {
        c0e g = e0e.g();
        x2a.a a2 = x2a.a();
        a2.b(g.a());
        a2.f(g.d());
        a2.c(g.b());
        a2.d(g.c());
        a2.e(Platform.ANDROID);
        return a2.a();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
