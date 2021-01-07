package defpackage;

/* renamed from: ts4  reason: default package */
public final class ts4 implements fjf<ss4> {
    private final wlf<fr4> a;
    private final wlf<dr4> b;
    private final wlf<p4d> c;
    private final wlf<n4d> d;
    private final wlf<hr4> e;

    public ts4(wlf<fr4> wlf, wlf<dr4> wlf2, wlf<p4d> wlf3, wlf<n4d> wlf4, wlf<hr4> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ss4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
