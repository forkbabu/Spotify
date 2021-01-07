package defpackage;

/* renamed from: lte  reason: default package */
public final class lte implements fjf<kte> {
    private final wlf<mte> a;
    private final wlf<cqe> b;
    private final wlf<sse> c;

    public lte(wlf<mte> wlf, wlf<cqe> wlf2, wlf<sse> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kte(this.a.get(), this.b.get(), this.c.get());
    }
}
