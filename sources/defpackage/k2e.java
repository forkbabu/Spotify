package defpackage;

import defpackage.h2e;

/* renamed from: k2e  reason: default package */
public final class k2e implements fjf<h2e> {
    private final wlf<h2e.a> a;

    public k2e(wlf<h2e.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h2e(this.a.get());
    }
}
