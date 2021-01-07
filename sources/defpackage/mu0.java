package defpackage;

/* renamed from: mu0  reason: default package */
public final class mu0 implements fjf<lu0> {
    private final wlf<ju0> a;
    private final wlf<nu0> b;

    public mu0(wlf<ju0> wlf, wlf<nu0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static lu0 a(ju0 ju0, nu0 nu0) {
        return new lu0(ju0, nu0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lu0(this.a.get(), this.b.get());
    }
}
