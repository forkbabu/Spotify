package defpackage;

import defpackage.bad;
import kotlin.jvm.internal.h;

/* renamed from: cad  reason: default package */
public final class cad implements fjf<y9d> {
    private final wlf<f4d> a;

    public cad(wlf<f4d> wlf) {
        this.a = wlf;
    }

    public static y9d a(wlf<f4d> wlf) {
        bad.a aVar = bad.a;
        h.e(wlf, "socialListeningProvider");
        return new aad(wlf);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a);
    }
}
