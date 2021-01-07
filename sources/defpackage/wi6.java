package defpackage;

import defpackage.rj6;
import defpackage.xi6;

/* renamed from: wi6  reason: default package */
public final class wi6 implements fjf<vi6> {
    private final wlf<xi6.a> a;
    private final wlf<rj6.a> b;

    public wi6(wlf<xi6.a> wlf, wlf<rj6.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vi6(this.a.get(), this.b.get());
    }
}
