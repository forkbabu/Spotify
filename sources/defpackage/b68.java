package defpackage;

/* renamed from: b68  reason: default package */
public final class b68 implements fjf<a68> {
    private final wlf<h8b> a;
    private final wlf<rc8> b;

    public b68(wlf<h8b> wlf, wlf<rc8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a68(this.a.get(), this.b.get());
    }
}
