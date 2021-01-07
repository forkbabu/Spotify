package defpackage;

/* renamed from: d68  reason: default package */
public final class d68 implements fjf<c68> {
    private final wlf<h5b> a;
    private final wlf<c8b> b;
    private final wlf<nb8> c;
    private final wlf<j81> d;

    public d68(wlf<h5b> wlf, wlf<c8b> wlf2, wlf<nb8> wlf3, wlf<j81> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c68(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
