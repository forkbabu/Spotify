package defpackage;

import defpackage.hi6;
import defpackage.rj6;

/* renamed from: gi6  reason: default package */
public final class gi6 implements fjf<fi6> {
    private final wlf<hi6.a> a;
    private final wlf<rj6.a> b;

    public gi6(wlf<hi6.a> wlf, wlf<rj6.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fi6(this.a.get(), this.b.get());
    }
}
