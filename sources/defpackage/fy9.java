package defpackage;

/* renamed from: fy9  reason: default package */
public final class fy9 implements fjf<ey9> {
    private final wlf<ere> a;
    private final wlf<iy9> b;

    public fy9(wlf<ere> wlf, wlf<iy9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ey9(this.a.get(), this.b.get());
    }
}
