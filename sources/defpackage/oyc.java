package defpackage;

/* renamed from: oyc  reason: default package */
public final class oyc implements fjf<nyc> {
    private final wlf<cqe> a;

    public oyc(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nyc(this.a.get());
    }
}
