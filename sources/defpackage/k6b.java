package defpackage;

/* renamed from: k6b  reason: default package */
public final class k6b implements fjf<h6b> {
    private final wlf<l6b> a;
    private final wlf<sg0<jua, b91>> b;

    public k6b(wlf<l6b> wlf, wlf<sg0<jua, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h6b(this.a.get(), this.b.get());
    }
}
