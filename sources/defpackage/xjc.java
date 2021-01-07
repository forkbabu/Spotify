package defpackage;

import defpackage.lgc;
import defpackage.zrc;

/* renamed from: xjc  reason: default package */
public final class xjc implements fjf<zrc.a> {
    private final wlf<lgc> a;

    public xjc(wlf<lgc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(lgc.a.class, this.a.get());
    }
}
