package defpackage;

/* renamed from: qz5  reason: default package */
public final class qz5 implements fjf<pz5> {
    private final wlf<xy5> a;
    private final wlf<tz5> b;
    private final wlf<jz5> c;
    private final wlf<fz5> d;
    private final wlf<bz5> e;

    public qz5(wlf<xy5> wlf, wlf<tz5> wlf2, wlf<jz5> wlf3, wlf<fz5> wlf4, wlf<bz5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pz5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
