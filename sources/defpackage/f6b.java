package defpackage;

/* renamed from: f6b  reason: default package */
public final class f6b implements fjf<c6b> {
    private final wlf<l6b> a;
    private final wlf<sg0<gua, b91>> b;

    public f6b(wlf<l6b> wlf, wlf<sg0<gua, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c6b(this.a.get(), this.b.get());
    }
}
