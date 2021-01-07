package defpackage;

/* renamed from: lq6  reason: default package */
public final class lq6 implements fjf<kq6> {
    private final wlf<wec> a;
    private final wlf<String> b;

    public lq6(wlf<wec> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kq6(this.a.get(), this.b.get());
    }
}
