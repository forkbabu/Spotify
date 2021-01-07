package defpackage;

/* renamed from: hj9  reason: default package */
public final class hj9 implements fjf<gj9> {
    private final wlf<yv9> a;
    private final wlf<kj9> b;

    public hj9(wlf<yv9> wlf, wlf<kj9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gj9(this.a.get(), this.b.get());
    }
}
