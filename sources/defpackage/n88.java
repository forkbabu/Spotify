package defpackage;

import defpackage.h1e;

/* renamed from: n88  reason: default package */
public final class n88 implements fjf<h1e<b91>> {
    private final wlf<e61> a;
    private final wlf<zc8> b;

    public n88(wlf<e61> wlf, wlf<zc8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        zc8 zc8 = this.b.get();
        zc8.m(this.a.get().b());
        h1e.a aVar = new h1e.a();
        aVar.a(new d78(zc8));
        return aVar.b();
    }
}
