package defpackage;

/* renamed from: ksd  reason: default package */
public final class ksd implements fjf<jsd> {
    private final wlf<cqe> a;

    public ksd(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jsd(this.a.get());
    }
}
