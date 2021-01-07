package defpackage;

import defpackage.rj6;

/* renamed from: vj4  reason: default package */
public final class vj4 implements fjf<uj4> {
    private final wlf<zj4> a;
    private final wlf<rj6.a> b;

    public vj4(wlf<zj4> wlf, wlf<rj6.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uj4(this.a.get(), this.b.get());
    }
}
