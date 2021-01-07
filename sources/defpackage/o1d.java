package defpackage;

/* renamed from: o1d  reason: default package */
public final class o1d implements fjf<n1d> {
    private final wlf<q1d> a;

    public o1d(wlf<q1d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n1d(this.a.get());
    }
}
