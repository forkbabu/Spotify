package defpackage;

import defpackage.ne4;

/* renamed from: rf4  reason: default package */
public final class rf4 implements fjf<qf4> {
    private final wlf<ne4.b> a;
    private final wlf<oe4> b;
    private final wlf<sf4> c;
    private final wlf<t54> d;

    public rf4(wlf<ne4.b> wlf, wlf<oe4> wlf2, wlf<sf4> wlf3, wlf<t54> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qf4(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
