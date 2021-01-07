package defpackage;

/* renamed from: xla  reason: default package */
public final class xla implements fjf<wla> {
    private final wlf<tla> a;
    private final wlf<cqe> b;

    public xla(wlf<tla> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wla(this.a.get(), this.b.get());
    }
}
