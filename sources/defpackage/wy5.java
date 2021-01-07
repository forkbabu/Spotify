package defpackage;

/* renamed from: wy5  reason: default package */
public final class wy5 implements fjf<vy5> {
    private final wlf<ere> a;

    public wy5(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vy5(this.a.get());
    }
}
