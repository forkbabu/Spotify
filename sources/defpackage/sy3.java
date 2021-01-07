package defpackage;

/* renamed from: sy3  reason: default package */
public final class sy3 implements fjf<ry3> {
    private final wlf<iy3> a;
    private final wlf<p71> b;
    private final wlf<ere> c;
    private final wlf<j81> d;
    private final wlf<String> e;

    public sy3(wlf<iy3> wlf, wlf<p71> wlf2, wlf<ere> wlf3, wlf<j81> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ry3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
