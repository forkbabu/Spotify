package defpackage;

import defpackage.qy5;

/* renamed from: kz5  reason: default package */
public final class kz5 implements fjf<jz5> {
    private final wlf<bz5> a;
    private final wlf<wx5> b;
    private final wlf<qy5.a> c;
    private final wlf<fm9> d;

    public kz5(wlf<bz5> wlf, wlf<wx5> wlf2, wlf<qy5.a> wlf3, wlf<fm9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jz5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
