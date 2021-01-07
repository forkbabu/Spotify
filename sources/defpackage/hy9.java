package defpackage;

/* renamed from: hy9  reason: default package */
public final class hy9 implements fjf<gy9> {
    private final wlf<ere> a;
    private final wlf<ky9> b;

    public hy9(wlf<ere> wlf, wlf<ky9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gy9(this.a.get(), this.b.get());
    }
}
