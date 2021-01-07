package defpackage;

import defpackage.l4e;

/* renamed from: n4e  reason: default package */
public final class n4e implements fjf<l4e> {
    private final wlf<l4e.a> a;
    private final wlf<o4e> b;
    private final wlf<j4e> c;
    private final wlf<y3e> d;
    private final wlf<jrd> e;

    public n4e(wlf<l4e.a> wlf, wlf<o4e> wlf2, wlf<j4e> wlf3, wlf<y3e> wlf4, wlf<jrd> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l4e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
