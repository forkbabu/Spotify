package defpackage;

import defpackage.o4e;

/* renamed from: p4e  reason: default package */
public final class p4e implements fjf<o4e> {
    private final wlf<o4e.a> a;
    private final wlf<c4e> b;

    public p4e(wlf<o4e.a> wlf, wlf<c4e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o4e(this.a.get(), this.b.get());
    }
}
