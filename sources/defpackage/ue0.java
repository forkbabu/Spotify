package defpackage;

/* renamed from: ue0  reason: default package */
public final class ue0 implements fjf<te0> {
    private final wlf<cqe> a;
    private final wlf<ae0> b;
    private final wlf<pe0> c;

    public ue0(wlf<cqe> wlf, wlf<ae0> wlf2, wlf<pe0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new te0(this.a.get(), this.b.get(), this.c.get());
    }
}
