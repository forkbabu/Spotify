package defpackage;

import defpackage.gld;
import kotlin.jvm.internal.h;

/* renamed from: hld  reason: default package */
public final class hld implements fjf<dld> {
    private final wlf<fld> a;

    public hld(wlf<fld> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fld fld = this.a.get();
        gld.a aVar = gld.a;
        h.e(fld, "endpoint");
        return new eld(fld);
    }
}
