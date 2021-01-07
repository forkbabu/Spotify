package defpackage;

/* renamed from: u87  reason: default package */
public final class u87 implements fjf<t87> {
    private final wlf<b87> a;
    private final wlf<a97> b;
    private final wlf<n97> c;

    public u87(wlf<b87> wlf, wlf<a97> wlf2, wlf<n97> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t87(this.a.get(), this.b.get(), this.c.get());
    }
}
