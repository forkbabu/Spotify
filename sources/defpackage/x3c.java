package defpackage;

import defpackage.w3c;
import kotlin.jvm.internal.h;

/* renamed from: x3c  reason: default package */
public final class x3c implements fjf<i61> {
    private final wlf<w51> a;

    public x3c(wlf<w51> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w51 w51 = this.a.get();
        w3c.a aVar = w3c.a;
        h.e(w51, "hubsConfig");
        return new i61(w51);
    }
}
