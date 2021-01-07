package defpackage;

import defpackage.h1e;

/* renamed from: ib4  reason: default package */
public final class ib4 implements fjf<h1e<b91>> {
    private final wlf<ng4> a;
    private final wlf<xe4> b;
    private final wlf<ze4> c;

    public ib4(wlf<ng4> wlf, wlf<xe4> wlf2, wlf<ze4> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        xe4 xe4 = this.b.get();
        xe4.m(this.a.get().b());
        h1e.a aVar = new h1e.a();
        aVar.a(new x94(xe4));
        aVar.a(this.c.get());
        return aVar.b();
    }
}
