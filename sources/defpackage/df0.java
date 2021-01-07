package defpackage;

/* renamed from: df0  reason: default package */
public final class df0 implements fjf<cf0> {
    private final wlf<cqe> a;

    public df0(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cf0(this.a.get());
    }
}
