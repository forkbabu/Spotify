package defpackage;

import com.spotify.ubi.specification.factories.z3;

/* renamed from: u9c  reason: default package */
public final class u9c implements fjf<t9c> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;
    private final wlf<ere> c;
    private final wlf<z3> d;

    public u9c(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<ere> wlf3, wlf<z3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t9c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
