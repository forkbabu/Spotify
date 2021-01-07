package defpackage;

/* renamed from: i64  reason: default package */
public final class i64 implements fjf<h64> {
    private final wlf<Boolean> a;
    private final wlf<zab> b;
    private final wlf<vb4> c;
    private final wlf<Boolean> d;
    private final wlf<Boolean> e;

    public i64(wlf<Boolean> wlf, wlf<zab> wlf2, wlf<vb4> wlf3, wlf<Boolean> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h64(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get().booleanValue(), this.e.get().booleanValue());
    }
}
