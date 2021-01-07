package defpackage;

import defpackage.hv5;

/* renamed from: dv5  reason: default package */
public final class dv5 implements fjf<hv5> {
    private final wlf<Boolean> a;
    private final wlf<av5> b;
    private final wlf<hv5.a> c;

    public dv5(wlf<Boolean> wlf, wlf<av5> wlf2, wlf<hv5.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        hv5 hv5 = this.a.get().booleanValue() ? this.b.get() : this.c.get();
        yif.g(hv5, "Cannot return null from a non-@Nullable @Provides method");
        return hv5;
    }
}
