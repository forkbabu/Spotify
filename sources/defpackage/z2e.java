package defpackage;

/* renamed from: z2e  reason: default package */
public final class z2e implements fjf<f3e> {
    private final wlf<g3e> a;
    private final wlf<i3e> b;

    public z2e(wlf<g3e> wlf, wlf<i3e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        f3e f3e = (g3e) this.a.get();
        f3e f3e2 = (i3e) this.b.get();
        if (ig0.b()) {
            f3e = f3e2;
        }
        yif.g(f3e, "Cannot return null from a non-@Nullable @Provides method");
        return f3e;
    }
}
