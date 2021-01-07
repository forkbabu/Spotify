package defpackage;

import defpackage.bgc;
import defpackage.zrc;

/* renamed from: mkc  reason: default package */
public final class mkc implements fjf<zrc.a> {
    private final wlf<bgc> a;

    public mkc(wlf<bgc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(bgc.a.class, this.a.get());
    }
}
