package defpackage;

/* renamed from: le0  reason: default package */
public final class le0 implements fjf<ke0> {
    private final wlf<ae0> a;
    private final wlf<cqe> b;
    private final wlf<pe0> c;

    public le0(wlf<ae0> wlf, wlf<cqe> wlf2, wlf<pe0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ke0(this.a.get(), this.b.get(), this.c.get());
    }
}
