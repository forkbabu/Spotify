package defpackage;

/* renamed from: r54  reason: default package */
public final class r54 implements fjf<q54> {
    private final wlf<t54> a;
    private final wlf<p71> b;
    private final wlf<j81> c;
    private final wlf<ere> d;

    public r54(wlf<t54> wlf, wlf<p71> wlf2, wlf<j81> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q54(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
