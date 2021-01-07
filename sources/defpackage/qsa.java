package defpackage;

/* renamed from: qsa  reason: default package */
public final class qsa implements fjf<psa> {
    private final wlf<fsa> a;
    private final wlf<rsa> b;
    private final wlf<ksa> c;
    private final wlf<tsa> d;

    public qsa(wlf<fsa> wlf, wlf<rsa> wlf2, wlf<ksa> wlf3, wlf<tsa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new psa(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
