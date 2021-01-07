package defpackage;

/* renamed from: yj9  reason: default package */
public final class yj9 implements fjf<xj9> {
    private final wlf<uj9> a;
    private final wlf<zj9> b;
    private final wlf<dk9> c;

    public yj9(wlf<uj9> wlf, wlf<zj9> wlf2, wlf<dk9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xj9(this.a.get(), this.b.get(), this.c.get());
    }
}
