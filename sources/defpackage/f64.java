package defpackage;

/* renamed from: f64  reason: default package */
public final class f64 implements fjf<e64> {
    private final wlf<Boolean> a;
    private final wlf<j64> b;

    public f64(wlf<Boolean> wlf, wlf<j64> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e64(this.a.get().booleanValue(), this.b.get());
    }
}
