package defpackage;

/* renamed from: rk5  reason: default package */
public final class rk5 implements fjf<qk5> {
    private final wlf<hha> a;
    private final wlf<p71> b;
    private final wlf<ere> c;

    public rk5(wlf<hha> wlf, wlf<p71> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qk5(this.a.get(), this.b.get(), this.c.get());
    }
}
