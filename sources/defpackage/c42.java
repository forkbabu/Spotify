package defpackage;

import defpackage.f42;

/* renamed from: c42  reason: default package */
public final class c42 implements fjf<b42> {
    private final wlf<f42.a> a;
    private final wlf<d42> b;

    public c42(wlf<f42.a> wlf, wlf<d42> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b42(this.a.get(), this.b.get());
    }
}
