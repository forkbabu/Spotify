package defpackage;

/* renamed from: egd  reason: default package */
public final class egd implements fjf<igd> {
    private final wlf<jz1> a;
    private final wlf<ere> b;
    private final wlf<cqe> c;

    public egd(wlf<jz1> wlf, wlf<ere> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new igd(this.a.get(), this.b.get(), this.c.get());
    }
}
