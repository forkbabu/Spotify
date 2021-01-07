package defpackage;

import defpackage.wj4;

/* renamed from: ak4  reason: default package */
public final class ak4 implements fjf<zj4> {
    private final wlf<dj4> a;
    private final wlf<wj4.a> b;

    public ak4(wlf<dj4> wlf, wlf<wj4.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zj4(this.a.get(), this.b.get());
    }
}
