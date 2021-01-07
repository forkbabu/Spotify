package defpackage;

/* renamed from: n6b  reason: default package */
public final class n6b implements fjf<m6b> {
    private final wlf<vz0> a;

    public n6b(wlf<vz0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m6b(this.a.get());
    }
}
