package defpackage;

/* renamed from: id1  reason: default package */
public final class id1 implements fjf<hd1> {
    private final wlf<jh1> a;
    private final wlf<vc1> b;
    private final wlf<ae1> c;
    private final wlf<yd1> d;
    private final wlf<dd1> e;
    private final wlf<ee1> f;

    public id1(wlf<jh1> wlf, wlf<vc1> wlf2, wlf<ae1> wlf3, wlf<yd1> wlf4, wlf<dd1> wlf5, wlf<ee1> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hd1(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
