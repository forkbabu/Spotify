package defpackage;

/* renamed from: b6b  reason: default package */
public final class b6b implements fjf<a6b> {
    private final wlf<vz0> a;
    private final wlf<sg0<gva, b91>> b;

    public b6b(wlf<vz0> wlf, wlf<sg0<gva, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a6b(this.a.get(), this.b.get());
    }
}
