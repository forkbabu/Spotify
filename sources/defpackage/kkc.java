package defpackage;

import defpackage.rfc;
import defpackage.zrc;

/* renamed from: kkc  reason: default package */
public final class kkc implements fjf<zrc.a> {
    private final wlf<rfc> a;

    public kkc(wlf<rfc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(rfc.a.class, this.a.get());
    }
}
