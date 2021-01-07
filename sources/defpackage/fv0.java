package defpackage;

/* renamed from: fv0  reason: default package */
public final class fv0 implements fjf<ev0> {
    private final wlf<cqe> a;

    public fv0(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ev0(this.a.get());
    }
}
