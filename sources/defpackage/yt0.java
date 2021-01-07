package defpackage;

/* renamed from: yt0  reason: default package */
public final class yt0 implements fjf<xt0> {
    private final wlf<vt0> a;
    private final wlf<zt0> b;

    public yt0(wlf<vt0> wlf, wlf<zt0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static xt0 a(vt0 vt0, zt0 zt0) {
        return new xt0(vt0, zt0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xt0(this.a.get(), this.b.get());
    }
}
